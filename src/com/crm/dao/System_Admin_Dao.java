package com.crm.dao;

import java.util.List;

import com.crm.domain.Client_Admin;
import com.crm.domain.Goods_Admin;
import com.crm.domain.System_Admin;



public interface System_Admin_Dao {
	
	public List<Client_Admin>  getAllClient_Admins();//获取所有客户管理员类
	public List<Goods_Admin> getAllGoods_Admins();//获取所有商品管理员类
	public boolean addClient_Admins(Client_Admin CA);//添加客户管理类
	public boolean addGood_Admins(Goods_Admin GA);//添加商品管理类
	public boolean resetGApsw(String GAId,String password);//重置商品管理员的密码
	public boolean resetCApsw(int CAId,String password);//重置客户管理员的密码
	public boolean logincheck_system(String id,String password);//系统管理员登陆类
	public boolean deleteClient_admin(String CAId);//删除客户管理员
	public boolean deleteGood_Admin(String GAId);//删除商品管理员
	public boolean resetSApsw(String SAId,String password);//重置系统管理员密码
	
}
