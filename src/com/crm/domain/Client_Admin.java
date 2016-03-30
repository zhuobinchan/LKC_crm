package com.crm.domain;

public class Client_Admin {
	private int client_admin_id;
	private String client_admin_name;
	private String client_admin_password;
	public Client_Admin() {
		super();
	}
	public Client_Admin(int client_admin_id, String client_admin_name,
			String client_admin_password) {
		super();
		this.client_admin_id = client_admin_id;
		this.client_admin_name = client_admin_name;
		this.client_admin_password = client_admin_password;
	}
	public int getClient_admin_id() {
		return client_admin_id;
	}
	public String getClient_admin_name() {
		return client_admin_name;
	}
	public String getClient_admin_password() {
		return client_admin_password;
	}
	public void setClient_admin_id(int client_admin_id) {
		this.client_admin_id = client_admin_id;
	}
	public void setClient_admin_name(String client_admin_name) {
		this.client_admin_name = client_admin_name;
	}
	public void setClient_admin_password(String client_admin_password) {
		this.client_admin_password = client_admin_password;
	}
}
