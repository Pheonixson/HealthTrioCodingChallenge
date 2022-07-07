package com.healthtrio.HealthTrioChallenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.healthtrio.models.IncentiveProgramData;

@RestController
@SpringBootApplication
public class HealthTrioChallengeApplication {

	private static final Logger log = LoggerFactory.getLogger(HealthTrioChallengeApplication.class);
	private RestTemplate restTemplate = new RestTemplate();

	public static void main(String[] args) {
		SpringApplication.run(HealthTrioChallengeApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@SuppressWarnings("finally")
	@RequestMapping("/")
	String home() {
		IncentiveProgramData[] ipda = restTemplate.getForObject(
				"https://www.healthit.gov/data/open-api?source=Meaningful-Use-Acceleration-Scorecard.csv",
				IncentiveProgramData[].class);
		
		Stream<IncentiveProgramData> stream = Arrays.stream(ipda);
		List<IncentiveProgramData> ipdList = stream.filter(e -> {
			boolean result = false;
			try {
				result = e.getPeriod().startsWith("2014");
			} catch (Exception ex) {

			} finally {
				return result;
			}
		}).sorted((e1, e2) -> e2.getPct_hospitals_mu_aiu().compareTo(e1.getPct_hospitals_mu_aiu())).collect(Collectors.toList());
		String result = "";
		for (IncentiveProgramData ipd : ipdList) {
			log.info(ipd.getRegion() + " " + ipd.getPeriod() + " " + ipd.getPct_hospitals_mu_aiu());
			result += (ipdList.indexOf(ipd) + 1) + " " + ipd.getRegion() + " " + ipd.getPeriod() + " " + ipd.getPct_hospitals_mu_aiu() + ". ";

		}
		return result;
	}

}
