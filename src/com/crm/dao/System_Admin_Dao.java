package com.crm.dao;

import java.util.List;

import com.crm.domain.Client_Admin;
import com.crm.domain.Goods_Admin;
import com.crm.domain.System_Admin;



public interface System_Admin_Dao {
	
	public List<Client_Admin>  getAllClient_Admins();//��ȡ���пͻ�����Ա��
	public List<Goods_Admin> getAllGoods_Admins();//��ȡ������Ʒ����Ա��
	public boolean addClient_Admins(Client_Admin CA);//��ӿͻ�������
	public boolean addGood_Admins(Goods_Admin GA);//�����Ʒ������
	public boolean resetGApsw(String GAId,String password);//������Ʒ����Ա������
	public boolean resetCApsw(int CAId,String password);//���ÿͻ�����Ա������
	public boolean logincheck_system(String id,String password);//ϵͳ����Ա��½��
	public boolean deleteClient_admin(String CAId);//ɾ���ͻ�����Ա
	public boolean deleteGood_Admin(String GAId);//ɾ����Ʒ����Ա
	public boolean resetSApsw(String SAId,String password);//����ϵͳ����Ա����
	
}
