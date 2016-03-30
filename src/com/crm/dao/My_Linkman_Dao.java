package com.crm.dao;

import java.util.List;

import com.crm.domain.Client_Basic;
import com.crm.domain.My_Linkman;

public interface My_Linkman_Dao {
	//��ȡ���пͻ�������Ϣ
	List<My_Linkman> getMy_Linkmans();
	//�����ͻ�
	List<My_Linkman> getMy_Linkmans(String name);
	
	//��ȡ�����ͻ��Ļ�����Ϣ
	My_Linkman getMy_Linkman(int id);
	
	//��ӿͻ�
	void addLinkman(My_Linkman client);
	
	//���¿ͻ���Ϣ
	void updataLinkman(My_Linkman client);
	
	//ɾ���ͻ�
	void deleteLinkman(int id);
}
