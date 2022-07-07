package com.healthtrio.models;

public class IncentiveProgramData {

	private String region;
	private String region_code;
	private String period;
	private String pct_md_pa_np_mu_aiu;
	private String pct_md_pa_np_mu;
	private String pct_md_mu_aiu;
	private String pct_md_mu;
	private String pct_np_mu_aiu;
	private String pct_np_mu;
	private String pct_pa_mu_aiu;
	private String pct_pa_mu;
	private String pct_hospitals_mu_aiu;
	private String pct_hospitals_mu;
	private String pct_cah_small_rural_mu_aiu;
	private String pct_cah_small_rural_mu;
	
	public IncentiveProgramData() {
		super();
	}

	public IncentiveProgramData(String region, String region_code, String period, String pct_md_pa_np_mu_aiu,
			String pct_md_pa_np_mu, String pct_md_mu_aiu, String pct_md_mu, String pct_np_mu_aiu, String pct_np_mu,
			String pct_pa_mu_aiu, String pct_pa_mu, String pct_hospitals_mu_aiu, String pct_hospitals_mu,
			String pct_cah_small_rural_mu_aiu, String pct_cah_small_rural_mu) {
		super();
		this.region = region;
		this.region_code = region_code;
		this.period = period;
		this.pct_md_pa_np_mu_aiu = pct_md_pa_np_mu_aiu;
		this.pct_md_pa_np_mu = pct_md_pa_np_mu;
		this.pct_md_mu_aiu = pct_md_mu_aiu;
		this.pct_md_mu = pct_md_mu;
		this.pct_np_mu_aiu = pct_np_mu_aiu;
		this.pct_np_mu = pct_np_mu;
		this.pct_pa_mu_aiu = pct_pa_mu_aiu;
		this.pct_pa_mu = pct_pa_mu;
		this.pct_hospitals_mu_aiu = pct_hospitals_mu_aiu;
		this.pct_hospitals_mu = pct_hospitals_mu;
		this.pct_cah_small_rural_mu_aiu = pct_cah_small_rural_mu_aiu;
		this.pct_cah_small_rural_mu = pct_cah_small_rural_mu;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getRegion_code() {
		return region_code;
	}

	public void setRegion_code(String region_code) {
		this.region_code = region_code;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getPct_md_pa_np_mu_aiu() {
		return pct_md_pa_np_mu_aiu;
	}

	public void setPct_md_pa_np_mu_aiu(String pct_md_pa_np_mu_aiu) {
		this.pct_md_pa_np_mu_aiu = pct_md_pa_np_mu_aiu;
	}

	public String getPct_md_pa_np_mu() {
		return pct_md_pa_np_mu;
	}

	public void setPct_md_pa_np_mu(String pct_md_pa_np_mu) {
		this.pct_md_pa_np_mu = pct_md_pa_np_mu;
	}

	public String getPct_md_mu_aiu() {
		return pct_md_mu_aiu;
	}

	public void setPct_md_mu_aiu(String pct_md_mu_aiu) {
		this.pct_md_mu_aiu = pct_md_mu_aiu;
	}

	public String getPct_md_mu() {
		return pct_md_mu;
	}

	public void setPct_md_mu(String pct_md_mu) {
		this.pct_md_mu = pct_md_mu;
	}

	public String getPct_np_mu_aiu() {
		return pct_np_mu_aiu;
	}

	public void setPct_np_mu_aiu(String pct_np_mu_aiu) {
		this.pct_np_mu_aiu = pct_np_mu_aiu;
	}

	public String getPct_np_mu() {
		return pct_np_mu;
	}

	public void setPct_np_mu(String pct_np_mu) {
		this.pct_np_mu = pct_np_mu;
	}

	public String getPct_pa_mu_aiu() {
		return pct_pa_mu_aiu;
	}

	public void setPct_pa_mu_aiu(String pct_pa_mu_aiu) {
		this.pct_pa_mu_aiu = pct_pa_mu_aiu;
	}

	public String getPct_pa_mu() {
		return pct_pa_mu;
	}

	public void setPct_pa_mu(String pct_pa_mu) {
		this.pct_pa_mu = pct_pa_mu;
	}

	public String getPct_hospitals_mu_aiu() {
		return pct_hospitals_mu_aiu;
	}

	public void setPct_hospitals_mu_aiu(String pct_hospitals_mu_aiu) {
		this.pct_hospitals_mu_aiu = pct_hospitals_mu_aiu;
	}

	public String getPct_hospitals_mu() {
		return pct_hospitals_mu;
	}

	public void setPct_hospitals_mu(String pct_hospitals_mu) {
		this.pct_hospitals_mu = pct_hospitals_mu;
	}

	public String getPct_cah_small_rural_mu_aiu() {
		return pct_cah_small_rural_mu_aiu;
	}

	public void setPct_cah_small_rural_mu_aiu(String pct_cah_small_rural_mu_aiu) {
		this.pct_cah_small_rural_mu_aiu = pct_cah_small_rural_mu_aiu;
	}

	public String getPct_cah_small_rural_mu() {
		return pct_cah_small_rural_mu;
	}

	public void setPct_cah_small_rural_mu(String pct_cah_small_rural_mu) {
		this.pct_cah_small_rural_mu = pct_cah_small_rural_mu;
	}

	@Override
	public String toString() {
		return "IncentiveProgamData [region=" + region + ", region_code=" + region_code + ", period=" + period
				+ ", pct_md_pa_np_mu_aiu=" + pct_md_pa_np_mu_aiu + ", pct_md_pa_np_mu=" + pct_md_pa_np_mu
				+ ", pct_md_mu_aiu=" + pct_md_mu_aiu + ", pct_md_mu=" + pct_md_mu + ", pct_np_mu_aiu=" + pct_np_mu_aiu
				+ ", pct_np_mu=" + pct_np_mu + ", pct_pa_mu_aiu=" + pct_pa_mu_aiu + ", pct_pa_mu=" + pct_pa_mu
				+ ", pct_hospitals_mu_aiu=" + pct_hospitals_mu_aiu + ", pct_hospitals_mu=" + pct_hospitals_mu
				+ ", pct_cah_small_rural_mu_aiu=" + pct_cah_small_rural_mu_aiu + ", pct_cah_small_rural_mu="
				+ pct_cah_small_rural_mu + "]" + "\n";
	}
	
	
	
}
