
package com.crm.service;

import java.util.List;

import com.crm.domain.Files;
import com.crm.dao.Client_Detail_Dao;
import com.crm.domain.Client_Detail;
import com.crm.domain.Client_Linkman;
import com.crm.domain.Contract;
import com.crm.domain.Feedback;
import com.crm.domain.Goods;
import com.crm.domain.Goods_Admin;
import com.crm.domain.Client_Admin;
import com.crm.domain.Client_Basic;
import com.crm.domain.My_Linkman;
import com.crm.domain.Relationship_Record;
import com.crm.factory.Factory;


public interface BussinessService {
	public List<Client_Admin> AllClient_Admins();//����ȫ���ͻ�����Ա
	//����������Ʒ��Ϣ
	List<Goods> findAllGoods();
	//������Ʒ��Ϣ
	void addGoods(Goods goods);
	//ɾ����Ʒ��Ϣ
	void deleteGoods(String goods_id);
	//�޸���Ʒ��Ϣ
	void updateGoods(Goods goods);
	//������Ʒ��Ϣ
	Goods findGoods(String goods_id);
	//�������пͻ�
	List<Client_Basic> findAllClient();
	//����ָ���ͻ�
	List<Client_Basic> findAllClient(String name);
	//�������пͻ���ϵ������
	List<Client_Linkman> findAllClientLinkmans();
	//���������ҷ���ϵ������
	List<My_Linkman> findAllMy_Linkman();
	//�����ҷ�ָ����ϵ��
	List<My_Linkman> findAllMy_Linkman(String name);
	//����������ϵ��¼
	List<Relationship_Record> findLinkRecord();
	
	//���ҵ����ͻ��Ļ�������
	Client_Basic findClientBasic(int id);
	//���ҵ�����ϵ������
	Client_Linkman findClientLinkman(int id);
	//���ҵ����ҷ���ϵ������
	My_Linkman findMy_Linkman(int id);
	
	//���ҵ����ͻ�����ϸ����
	Client_Detail findClientDetail(int id);
	
	//ɾ�������ͻ�
	void deleteClient(int id);
	//ɾ����ϵ��
	void deleteClientLinkman(int id);
	//ɾ���ҷ���ϵ��
	void deleteMy_Linkman(int id);
	//ɾ����ϵ��¼
	void deleteLinkRecord(int id);
	
	//�����ƿͻ���Ϣ
	void updataClient(Client_Basic client);
	//������ϵ����Ϣ
	void updataClientLinkman(Client_Linkman client);
	//�����ҷ���ϵ����Ϣ
	void updataMy_Linkman(My_Linkman client);
		
	//���ӿͻ���������
	void addClientBasic(Client_Basic client);
	//�����ҷ���ϵ������
	void addMy_Linkman(My_Linkman client);
	//������ϵ��¼
	void addLinkRecord(Relationship_Record record);
	
	
	public List<Goods_Admin> allGoods_Admins();//��ȡ������Ʒ�ͻ�����
	public boolean addClient_Admin(Client_Admin CA);//��ӿͻ�����Ա
	public boolean addGood_Admin(Goods_Admin GA);//�����Ʒ����Ա
	
	public boolean deleteCA(String CAId);//ɾ���ͻ�����Ա
	public boolean delectGA(String GAId);//ɾ����Ʒ����Ա
	public List<Files> getAllFiles();//��ȡ�����ļ�
	public List<Contract> getAllContracts();//��ȡ���к�ͬ
	
	public boolean uploadContracts(String upusername, String upfilename,String updata);//�ϴ���ͬ
	public boolean uploadFiles(String upusername, String upfilename,String updata);//�ϴ��ļ�
	public List<Feedback> getAllFeedbacks();//��ȡ���з�����Ϣ
	public void addFeedbacks(Feedback feedback);//��ӷ�����Ϣ
	
	public boolean deleteFeedBack(String fbId);

	
	//��Excel����ͻ���Ϣ
	public void pullExcle(String filePath);

	public boolean resetSApsw(String SAId,String password);
	public boolean resetCApsw(int CAId,String password);
	public boolean resetGApsw(String GAId,String password);

}
