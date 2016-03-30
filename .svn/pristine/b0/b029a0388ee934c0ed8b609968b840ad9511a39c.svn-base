
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
	public List<Client_Admin> AllClient_Admins();//查找全部客户管理员
	//查找所有商品信息
	List<Goods> findAllGoods();
	//增加商品信息
	void addGoods(Goods goods);
	//删除商品信息
	void deleteGoods(String goods_id);
	//修改商品信息
	void updateGoods(Goods goods);
	//查找商品信息
	Goods findGoods(String goods_id);
	//查找所有客户
	List<Client_Basic> findAllClient();
	//查找指定客户
	List<Client_Basic> findAllClient(String name);
	//查找所有客户联系人资料
	List<Client_Linkman> findAllClientLinkmans();
	//查找所有我方联系人资料
	List<My_Linkman> findAllMy_Linkman();
	//查找我方指定联系人
	List<My_Linkman> findAllMy_Linkman(String name);
	//查找所有联系记录
	List<Relationship_Record> findLinkRecord();
	
	//查找单个客户的基本资料
	Client_Basic findClientBasic(int id);
	//查找单个联系人资料
	Client_Linkman findClientLinkman(int id);
	//查找单个我方联系人资料
	My_Linkman findMy_Linkman(int id);
	
	//查找单个客户的详细资料
	Client_Detail findClientDetail(int id);
	
	//删除单个客户
	void deleteClient(int id);
	//删除联系人
	void deleteClientLinkman(int id);
	//删除我方联系人
	void deleteMy_Linkman(int id);
	//删除联系记录
	void deleteLinkRecord(int id);
	
	//更新善客户信息
	void updataClient(Client_Basic client);
	//更新联系人信息
	void updataClientLinkman(Client_Linkman client);
	//更新我方联系人信息
	void updataMy_Linkman(My_Linkman client);
		
	//增加客户基本资料
	void addClientBasic(Client_Basic client);
	//增加我方联系人资料
	void addMy_Linkman(My_Linkman client);
	//增加联系记录
	void addLinkRecord(Relationship_Record record);
	
	
	public List<Goods_Admin> allGoods_Admins();//获取所有商品客户管理
	public boolean addClient_Admin(Client_Admin CA);//添加客户管理员
	public boolean addGood_Admin(Goods_Admin GA);//添加商品管理员
	
	public boolean deleteCA(String CAId);//删除客户管理员
	public boolean delectGA(String GAId);//删除商品管理员
	public List<Files> getAllFiles();//获取所有文件
	public List<Contract> getAllContracts();//获取所有合同
	
	public boolean uploadContracts(String upusername, String upfilename,String updata);//上传合同
	public boolean uploadFiles(String upusername, String upfilename,String updata);//上传文件
	public List<Feedback> getAllFeedbacks();//获取所有反馈信息
	public void addFeedbacks(Feedback feedback);//添加反馈信息
	
	public boolean deleteFeedBack(String fbId);

	
	//从Excel导入客户信息
	public void pullExcle(String filePath);

	public boolean resetSApsw(String SAId,String password);
	public boolean resetCApsw(int CAId,String password);
	public boolean resetGApsw(String GAId,String password);

}
