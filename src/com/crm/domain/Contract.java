package com.crm.domain;

public class Contract {
	private int contract_id;
	private String contract_name;
	private String contract_user;
	private String contract_time;
	public Contract() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Contract(int contract_id, String contract_name,
			String contract_user, String contract_time) {
		super();
		this.contract_id = contract_id;
		this.contract_name = contract_name;
		this.contract_user = contract_user;
		this.contract_time = contract_time;
	}

	public String getContract_time() {
		return contract_time;
	}

	public void setContract_time(String contract_time) {
		this.contract_time = contract_time;
	}

	public int getContract_id() {
		return contract_id;
	}
	public void setContract_id(int contract_id) {
		this.contract_id = contract_id;
	}
	public String getContract_name() {
		return contract_name;
	}
	public void setContract_name(String contract_name) {
		this.contract_name = contract_name;
	}
	public String getContract_user() {
		return contract_user;
	}
	public void setContract_user(String contract_user) {
		this.contract_user = contract_user;
	}
}
