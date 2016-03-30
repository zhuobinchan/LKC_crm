package com.crm.dao;

import java.util.List;

import com.crm.domain.Client_Detail;

public interface Client_Detail_Dao {
	
	//获取所有客户详细信息
	List<Client_Detail> getClient_Details();
	//获取单个客户详细信息
	Client_Detail getClientDetail(int id);
	
	//添加客户
	void addClientDetail(Client_Detail client);
	
	//删除客户
	void deleteClientDetail(Client_Detail client);
}
