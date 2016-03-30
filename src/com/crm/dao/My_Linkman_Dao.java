package com.crm.dao;

import java.util.List;

import com.crm.domain.Client_Basic;
import com.crm.domain.My_Linkman;

public interface My_Linkman_Dao {
	//获取所有客户基本信息
	List<My_Linkman> getMy_Linkmans();
	//搜索客户
	List<My_Linkman> getMy_Linkmans(String name);
	
	//获取单个客户的基本信息
	My_Linkman getMy_Linkman(int id);
	
	//添加客户
	void addLinkman(My_Linkman client);
	
	//更新客户信息
	void updataLinkman(My_Linkman client);
	
	//删除客户
	void deleteLinkman(int id);
}
