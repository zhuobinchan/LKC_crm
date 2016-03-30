package com.crm.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.crm.dao.My_Linkman_Dao;
import com.crm.domain.Client_Basic;
import com.crm.domain.My_Linkman;
import com.crm.jdbc.Database;

public class My_Linkman_Impl implements My_Linkman_Dao {
	private PreparedStatement pstam;
	@Override//查找所有联系人资料
	public List<My_Linkman> getMy_Linkmans() {
		List<My_Linkman> all_Client=new ArrayList<My_Linkman>();
		My_Linkman client=null;
		
		String sql="select * from my_linkman";
		ResultSet rs=Database.query(sql);
		
		try {
			
			while(rs.next()){
				client=new My_Linkman();	
				
				client.setMyLMbirthday(rs.getString("myLMbirthday"));
				client.setMyLMdepartment(rs.getString("myLMdepartment"));
				client.setMyLMe_mail(rs.getString("myLMe_mail"));
				client.setMyLMid(rs.getInt("myLMid"));
				client.setMyLMname(rs.getString("myLMname"));
				client.setMyLMphone(rs.getString("myLMphone"));
				client.setMyLMpost(rs.getString("myLMpost"));
				client.setMyLMsex(rs.getString("myLMsex"));
				
				all_Client.add(client);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Database.Close();
		return all_Client;
	}

	@Override
	public My_Linkman getMy_Linkman(int id) {
		My_Linkman client=null;
		
		String sql="select * from my_linkman where myLMid='"+id+"'";
		ResultSet rs=Database.query(sql);
		
		try {
			
			while(rs.next()){
				client=new My_Linkman();	
				
				client.setMyLMbirthday(rs.getString("myLMbirthday"));
				client.setMyLMdepartment(rs.getString("myLMdepartment"));
				client.setMyLMe_mail(rs.getString("myLMe_mail"));
				client.setMyLMid(rs.getInt("myLMid"));
				client.setMyLMname(rs.getString("myLMname"));
				client.setMyLMphone(rs.getString("myLMphone"));
				client.setMyLMpost(rs.getString("myLMpost"));
				client.setMyLMsex(rs.getString("myLMsex"));

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Database.Close();
		return client;
	}

	@Override
	public void addLinkman(My_Linkman client) {
		
		Connection conn=Database.getConnection();
		String sql="INSERT my_linkman (myLMid,myLMname,myLMsex,myLMbirthday,myLMdepartment,myLMpost,myLMphone,myLMe_mail) values (?,?,?,?,?,?,?,?)";
		try {
			pstam=conn.prepareStatement(sql);
			pstam.setInt(1, client.getMyLMid());
			pstam.setString(2, client.getMyLMname());
			pstam.setString(3, client.getMyLMsex());
			pstam.setString(4, client.getMyLMbirthday());
			pstam.setString(5, client.getMyLMdepartment());
			pstam.setString(6, client.getMyLMpost());
			pstam.setString(7, client.getMyLMphone());
			pstam.setString(8, client.getMyLMe_mail());
			pstam.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Database.Close();
		
	}

	@Override
	public void updataLinkman(My_Linkman client) {
		Connection conn=Database.getConnection();
		String sql="update my_linkman set myLMe_mail=?,myLMname=?,myLMsex=?,"
				+ "myLMbirthday=?,myLMdepartment=?,myLMpost=?,myLMphone=? where myLMid=?";
		try {
			pstam=conn.prepareStatement(sql);
			
			pstam.setInt(8, client.getMyLMid());
			pstam.setString(2, client.getMyLMname());
			pstam.setString(3, client.getMyLMsex());
			pstam.setString(4, client.getMyLMbirthday());
			pstam.setString(5, client.getMyLMdepartment());
			pstam.setString(6, client.getMyLMpost());
			pstam.setString(7, client.getMyLMphone());
			pstam.setString(1, client.getMyLMe_mail());
			
			pstam.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Database.Close();		
}		
	

	@Override
	public void deleteLinkman(int id) {
		String sql="delete from my_linkman where myLMid=?";
		Connection conn=Database.getConnection();
		try {
			pstam=conn.prepareStatement(sql);
			pstam.setInt(1, id);
			pstam.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<My_Linkman> getMy_Linkmans(String name) {
		List<My_Linkman> all_Client=new ArrayList<My_Linkman>();
		My_Linkman client=null;
		
		String sql="select * from my_linkman where myLMname='"+name+"'";
		ResultSet rs=Database.query(sql);
		
		try {
			
			while(rs.next()){
				client=new My_Linkman();	
				
				client.setMyLMbirthday(rs.getString("myLMbirthday"));
				client.setMyLMdepartment(rs.getString("myLMdepartment"));
				client.setMyLMe_mail(rs.getString("myLMe_mail"));
				client.setMyLMid(rs.getInt("myLMid"));
				client.setMyLMname(rs.getString("myLMname"));
				client.setMyLMphone(rs.getString("myLMphone"));
				client.setMyLMpost(rs.getString("myLMpost"));
				client.setMyLMsex(rs.getString("myLMsex"));
				
				all_Client.add(client);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Database.Close();
		return all_Client;
	}

}
