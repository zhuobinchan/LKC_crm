package com.crm.dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;















import com.crm.dao.System_Admin_Dao;
import com.crm.domain.Client_Admin;
import com.crm.domain.Goods_Admin;
import com.crm.domain.System_Admin;
import com.crm.jdbc.Database;
import com.crm.utils.ServiceUtils;

public class System_Admin_Impl implements System_Admin_Dao {
	Database ds = null;
	Connection conn = null;
	PreparedStatement pstm = null;
	//获取全部客户管理类
	@Override
	public List<Client_Admin> getAllClient_Admins() {
		List<Client_Admin> all=new ArrayList<Client_Admin>();
		Client_Admin CA=null;
		try {
		ds=new Database();
		conn=Database.getConnection();
		String sql="select * from client_admin";
		pstm=conn.prepareStatement(sql);
		ResultSet rs=pstm.executeQuery();
		
		while (rs.next()) {
			CA=new Client_Admin();
			CA.setClient_admin_id( rs.getInt("client_admin_id"));
			CA.setClient_admin_name(rs.getString("client_admin_name"));
			CA.setClient_admin_password(rs.getString("client_admin_password"));
			all.add(CA);
		}
		return all;
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			  try {
				pstm.close();
				conn.close(); 
				Database.Close();
			} catch (SQLException e) {
				e.printStackTrace();
			}			   
		}
		return null;
	}
	
	
	
	//获取所有商品管理员类
	@Override
	public List<Goods_Admin> getAllGoods_Admins() {
		List<Goods_Admin> all=new ArrayList<Goods_Admin>();
		Goods_Admin GA=null;
		try {
		ds=new Database();
		conn=Database.getConnection();
		String sql="select * from goods_admin";
		pstm=conn.prepareStatement(sql);
		ResultSet rs=pstm.executeQuery();
		
		while (rs.next()) {
			GA=new Goods_Admin();
			GA.setGAid(rs.getString("GAid"));
			GA.setGAage(rs.getInt("GAage"));
			GA.setGAgender(rs.getString("GAgender"));
			GA.setGAname(rs.getString("GAname"));
			GA.setGApsw(rs.getString("GApsw"));
			all.add(GA);
		}
		return all;
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			  try {
				pstm.close();
				conn.close(); 
				Database.Close();
			} catch (SQLException e) {
				e.printStackTrace();
			}			   
		}
		return null;
	}


	//添加客户管理类
	@Override
	public boolean addClient_Admins(Client_Admin CA) {
		try {
		ds=new Database();
		conn=Database.getConnection();
		String sql = "INSERT client_admin(client_admin_id,client_admin_name,client_admin_password) VALUES(?,?,?)";
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1,CA.getClient_admin_id());
		pstm.setString(2,CA.getClient_admin_name());
		pstm.setString(3, ServiceUtils.md5(CA.getClient_admin_password()));
		pstm.executeUpdate();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
		return true;
	}


	//添加商品管理类
	@Override
	public boolean addGood_Admins(Goods_Admin GA) {
		try {
		ds=new Database();
		conn=Database.getConnection();
		String sql = "INSERT goods_admin(GAid,GAname,GAgender,GAage,GApsw) VALUES(?,?,?,?,?)";
		pstm = conn.prepareStatement(sql);
		pstm.setString(1,GA.getGAid());
		pstm.setString(2,GA.getGAname());
		pstm.setString(3, GA.getGAgender());
		pstm.setInt(4, GA.getGAage());
		pstm.setString(5, ServiceUtils.md5(GA.getGApsw()));
		pstm.executeUpdate();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
		return true;		
	}



	@Override
	public boolean resetGApsw(String GAId,String password) {
		try {
			ds=new Database();
			conn=Database.getConnection();
			String sql = "UPDATE goods_admin SET GApsw=? WHERE GAid=?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, ServiceUtils.md5(password));
			pstm.setString(2,GAId);
			pstm.executeUpdate();
			
			} catch (SQLException e) {
				
				e.printStackTrace();
				return false;
			}
			return true;		
		}

	@Override
	public boolean resetSApsw(String SAId,String password) {
		try {
			ds=new Database();
			conn=Database.getConnection();
			String sql = "UPDATE system_admin SET SApwd=? WHERE SAid=?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, ServiceUtils.md5(password));
			pstm.setString(2,SAId);
			pstm.executeUpdate();
			
			} catch (SQLException e) {
				
				e.printStackTrace();
				return false;
			}
			return true;		
		}

	@Override
	public boolean resetCApsw(int CAId,String password) {
		try {
			ds=new Database();
			conn=Database.getConnection();
			String sql = "UPDATE client_admin SET client_admin_password=? WHERE client_admin_id=?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, ServiceUtils.md5(password));
			pstm.setInt(2,CAId);
			pstm.executeUpdate();
			
			} catch (SQLException e) {
				
				e.printStackTrace();
				return false;
			}
			return true;	
	}
	
	//系统管理员登陆类
	public boolean logincheck_system(String id,String password){
		String sql="select SAid,SApwd from system_admin where SAid="+id;
		ResultSet rs=(ResultSet) Database.query(sql);
		try{
			while(rs.next()){
				String passwordMD5=ServiceUtils.md5(password);
				if(passwordMD5.equals(rs.getString("SApwd"))){
                	return true;
				}
				else{
					return false;
				}	
			}
		}catch(SQLException e){
			e.printStackTrace();	
		}finally{
			Database.Close();
		}
		return false;
	}


	//删除客户管理员
	@Override
	public boolean deleteClient_admin(String CAId) {
		ds=new Database();
		conn=Database.getConnection();
		String sql = "delete from client_admin where client_admin_id=?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, new Integer(CAId));
			pstm.executeUpdate();
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
	}


	//删除商品管理员
	@Override
	public boolean deleteGood_Admin(String GAId) {
		ds=new Database();
		conn=Database.getConnection();
		String sql = "delete from goods_admin where GAid=?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, GAId);
			pstm.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
}
