package com.crm.service.impl;

import java.io.IOException;
import java.util.List;

import jxl.read.biff.BiffException;

import com.crm.domain.Contract;
import com.crm.domain.Feedback;
import com.crm.domain.Files;
import com.crm.domain.Client_Basic;
import com.crm.domain.Client_Admin;
import com.crm.domain.Client_Detail;
import com.crm.domain.Client_Linkman;
import com.crm.domain.Goods;
import com.crm.domain.Goods_Admin;
import com.crm.domain.My_Linkman;
import com.crm.domain.Relationship_Record;
import com.crm.factory.Factory;
import com.crm.service.BussinessService;

public class BussinessService_Impl implements BussinessService {
	//查找所有商品信息
	public List<Goods> findAllGoods() {
		return Factory.getGoods_Impl().getAllGoods();
	}
	//增加商品信息
	public void addGoods(Goods goods) {
		Factory.getGoods_Impl().addGoods(goods);
	}
	//删除商品信息
    public void deleteGoods(String goods_id) {
		Factory.getGoods_Impl().deleteGoods(goods_id);
	}
	//修改商品信息
    public void updateGoods(Goods goods) {
    	Factory.getGoods_Impl().updataGoods(goods);
    }
    //查找商品信息
    public Goods findGoods(String goods_id) {
		return Factory.getGoods_Impl().getGoods(goods_id);
	}
    
	@Override//查找所用的客户，返回基本信息
	public List<Client_Basic> findAllClient() {	
		return Factory.getClient_Basic_Impl().getClient_Basic();
	}

	@Override//增加新的客户基本信息
	public void addClientBasic(Client_Basic client) {
		Factory.getClient_Basic_Impl().addClient(client);		
	}
	@Override
	public List<Client_Admin> AllClient_Admins() {
		return Factory.getSystem_Admin_Impl().getAllClient_Admins();
	}

	@Override
	public List<Goods_Admin> allGoods_Admins() {
		
		return Factory.getSystem_Admin_Impl().getAllGoods_Admins();
	}

	@Override
	public boolean addClient_Admin(Client_Admin CA) {
		return Factory.getSystem_Admin_Impl().addClient_Admins(CA);
	}

	@Override
	public boolean addGood_Admin(Goods_Admin GA) {
		return Factory.getSystem_Admin_Impl().addGood_Admins(GA);
	}

	@Override//查找单个客户的基本资料
	public Client_Basic findClientBasic(int id) {		
		return Factory.getClient_Basic_Impl().getClientBasic(id);
	}

	@Override//查找单个客户的详细资料
	public Client_Detail findClientDetail(int id) {
		return Factory.getClient_Detail_Impl().getClientDetail(id);
	}

	@Override
	public boolean deleteCA(String CAId) {
		return Factory.getSystem_Admin_Impl().deleteClient_admin(CAId);
	}

	@Override
	public boolean delectGA(String GAId) {
		return Factory.getSystem_Admin_Impl().deleteGood_Admin(GAId);
	}

	@Override//删除单个客户
	public void deleteClient(int id) {
		Factory.getClient_Basic_Impl().deleteClient(id);
	}

	@Override//更新客户信息
	public void updataClient(Client_Basic client) {
		Factory.getClient_Basic_Impl().updataClient(client);
	}

	@Override//查找所用的客户，返回基本信息
	public List<Client_Linkman> findAllClientLinkmans() {
		return Factory.getClient_Linkman_Impl().getClient_Linkman();
	}

	@Override//查找单个客户联系人资料
	public Client_Linkman findClientLinkman(int id) {		
		return Factory.getClient_Linkman_Impl().getClientLinkman(id);
	}

	@Override//删除单个客户
	public void deleteClientLinkman(int id) {
		Factory.getClient_Linkman_Impl().deleteClientLinkman(id);
	}

	@Override//更新客户联系人信息
	public void updataClientLinkman(Client_Linkman client) {
		Factory.getClient_Linkman_Impl().updataClientLinkman(client);
	}

	

	
	@Override
	public List<Files> getAllFiles() {
		return Factory.getFiles_Impl().allFiles();
	}

	@Override
	public boolean uploadFiles(String upusername, String upfilename,
			String updata) {
		return Factory.getFiles_Impl().updateFiles(upusername, upfilename, updata);
	}
	
	@Override
	public List<Contract> getAllContracts() {
		return Factory.getContracts_Impl().allContracts();
	}

	@Override
	public boolean uploadContracts(String upusername, String upfilename,
			String updata) {
		return Factory.getContracts_Impl().updatecontract(upusername, upfilename, updata);
	}


	@Override
	public List<My_Linkman> findAllMy_Linkman() {
		return Factory.getMy_Linkman_Impl().getMy_Linkmans();
	}


	@Override
	public My_Linkman findMy_Linkman(int id) {
		return Factory.getMy_Linkman_Impl().getMy_Linkman(id);
	}


	@Override
	public void deleteMy_Linkman(int id) {
		Factory.getMy_Linkman_Impl().deleteLinkman(id);
	}


	@Override
	public void updataMy_Linkman(My_Linkman client) {
		Factory.getMy_Linkman_Impl().updataLinkman(client);
	}


	@Override
	public void addMy_Linkman(My_Linkman client) {
		Factory.getMy_Linkman_Impl().addLinkman(client);
	}

	@Override
	public List<Feedback> getAllFeedbacks() {
		return Factory.getFeedback_Dao_Impl().allFeedbacks();
	}
	@Override
	public List<Client_Basic> findAllClient(String name) {
		return Factory.getClient_Basic_Impl().getClient_Basic(name);
	}
	@Override
	public List<My_Linkman> findAllMy_Linkman(String name) {
		return Factory.getMy_Linkman_Impl().getMy_Linkmans(name);
	}
	@Override
	public void addFeedbacks(Feedback feedback) {
		Factory.getFeedback_Dao_Impl().addFeedbacks(feedback);
	}
	@Override
	public List<Relationship_Record>  findLinkRecord() {
		return Factory.getRelationship_Record_Impl().getRelationship_Record();
		
	}
	@Override
	public void deleteLinkRecord(int id) {
		Factory.getRelationship_Record_Impl().deleteRelationship_Record(id);
	}
	@Override
	public void addLinkRecord(Relationship_Record record) {
		Factory.getRelationship_Record_Impl().addRelationship_Record(record);
	}
	@Override
	public boolean deleteFeedBack(String fbId) {
		return Factory.getFeedback_Dao_Impl().deleteFeedback(fbId);
	}

	@Override
	public void pullExcle(String filePath) {
		try {
			Factory.getClient_Basic_Impl().ExcelClient(filePath);
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean resetSApsw(String SAId, String password) {
		return Factory.getSystem_Admin_Impl().resetSApsw(SAId, password);
	}
	@Override
	public boolean resetCApsw(int CAId, String password) {
		return Factory.getSystem_Admin_Impl().resetCApsw(CAId, password);
	}
	@Override
	public boolean resetGApsw(String GAId, String password) {
		return Factory.getSystem_Admin_Impl().resetGApsw(GAId, password);
	}


}
