package com.crm.dao;

import java.util.List;

import com.crm.domain.Client_Detail;

public interface Client_Detail_Dao {
	
	//��ȡ���пͻ���ϸ��Ϣ
	List<Client_Detail> getClient_Details();
	//��ȡ�����ͻ���ϸ��Ϣ
	Client_Detail getClientDetail(int id);
	
	//��ӿͻ�
	void addClientDetail(Client_Detail client);
	
	//ɾ���ͻ�
	void deleteClientDetail(Client_Detail client);
}
