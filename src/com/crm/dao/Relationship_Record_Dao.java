package com.crm.dao;

import java.util.List;

import com.crm.domain.Relationship_Record;

public interface Relationship_Record_Dao {

	//获取所有客户基本信息
	List<Relationship_Record> getRelationship_Record();
	
	//搜索所有客户基本信息
	//List<Client_Basic> getClient_Basic(String name);
	
	//添加客户
	void addRelationship_Record(Relationship_Record record);
	
	//删除客户
	void deleteRelationship_Record(int id);
	
}
