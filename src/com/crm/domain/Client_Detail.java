package com.crm.domain;

public class Client_Detail {
	private int client_id;
	private int client_grade;
	private String client_type;
	private String client_industry;
	private String client_property;
	private String district;
	private String city;
	private String province;
	private int bank_account;
	private String bank;
	private String credit;
	private String remark;
	
	public Client_Detail(int client_id, int client_grade, String client_type,
			String client_industry, String client_property, String district,
			String city, String province, int bank_account, String bank,
			String credit, String remark) {
		super();
		this.client_id = client_id;
		this.client_grade = client_grade;
		this.client_type = client_type;
		this.client_industry = client_industry;
		this.client_property = client_property;
		this.district = district;
		this.city = city;
		this.province = province;
		this.bank_account = bank_account;
		this.bank = bank;
		this.credit = credit;
		this.remark = remark;
	}

	public Client_Detail() {
		super();
	}

	public int getClient_id() {
		return client_id;
	}

	public int getClient_grade() {
		return client_grade;
	}

	public String getClient_type() {
		return client_type;
	}

	public String getClient_industry() {
		return client_industry;
	}

	public String getClient_property() {
		return client_property;
	}

	public String getDistrict() {
		return district;
	}

	public String getCity() {
		return city;
	}

	public String getProvince() {
		return province;
	}

	public int getBank_account() {
		return bank_account;
	}

	public String getBank() {
		return bank;
	}

	public String getCredit() {
		return credit;
	}

	public String getRemark() {
		return remark;
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	public void setClient_grade(int client_grade) {
		this.client_grade = client_grade;
	}

	public void setClient_type(String client_type) {
		this.client_type = client_type;
	}

	public void setClient_industry(String client_industry) {
		this.client_industry = client_industry;
	}

	public void setClient_property(String client_property) {
		this.client_property = client_property;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setBank_account(int bank_account) {
		this.bank_account = bank_account;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Client_Detail [client_id=" + client_id + ", client_grade="
				+ client_grade + ", client_type=" + client_type
				+ ", client_industry=" + client_industry + ", client_property="
				+ client_property + ", district=" + district + ", city=" + city
				+ ", province=" + province + ", bank_account=" + bank_account
				+ ", bank=" + bank + ", credit=" + credit + ", remark="
				+ remark + "]";
	}
}
