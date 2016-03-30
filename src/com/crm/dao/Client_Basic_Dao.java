package com.crm.dao;


import java.io.IOException;
import java.util.List;

import jxl.read.biff.BiffException;

import com.crm.domain.Client_Basic;

public interface Client_Basic_Dao {

	//获取所有客户基本信息
	List<Client_Basic> getClient_Basic();
	//搜索所有客户基本信息
	List<Client_Basic> getClient_Basic(String name);
	
	//获取单个客户的基本信息
	Client_Basic getClientBasic(int id);
	
	//添加客户
	void addClient(Client_Basic client);
	
	//更新客户信息
	void updataClient(Client_Basic client);
	
	//删除客户
	void deleteClient(int id);
	
	//从EXCEL导出客户信息
	void ExcelClient(String filePath) throws BiffException, IOException;
}
