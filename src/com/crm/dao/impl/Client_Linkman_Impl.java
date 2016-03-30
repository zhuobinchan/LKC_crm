package com.crm.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.crm.dao.Client_Linkman_Dao;
import com.crm.domain.Client_Basic;
import com.crm.domain.Client_Linkman;
import com.crm.jdbc.Database;

public class Client_Linkman_Impl implements Client_Linkman_Dao {
	private PreparedStatement pstam;
	@Override//获取所有客户基本信息
	public List<Client_Linkman> getClient_Linkman() {
		
		List<Client_Linkman> all_Client=new ArrayList<Client_Linkman>();
		Client_Linkman client=null;
		
		String sql="select * from client_linkman";
		ResultSet rs=Database.query(sql);
		
		try {
			
			while(rs.next()){
				client=new Client_Linkman();		
				//客户基本资料
				client.setclientId(rs.getInt("ClientId"));
				client.setcLMname(rs.getString("cLMname"));
				client.setcLMsex(rs.getString("cLMsex"));
				client.setcLMbirthday(rs.getString("cLMbirthday"));
				client.setcLMdepartment(rs.getString("cLMdepartment"));
				client.setcLMpost(rs.getString("cLMpost"));
				client.setcLMphone(rs.getString("cLMphone"));
				client.setcLMe_mai(rs.getString("cLMe_mai"));
				client.setcLMid(rs.getInt("CLMid"));
				
				all_Client.add(client);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Database.Close();
		return all_Client;
	}

	@Override//获取单个客户的基本信息
	public Client_Linkman getClientLinkman(int id) {
		Client_Linkman client=null;
		
		String sql="select * from client_linkman where ClientId='"+id+"'";
		ResultSet rs=Database.query(sql);
		
		try {
			
			while(rs.next()){
				client=new Client_Linkman();				
				client.setclientId(rs.getInt("ClientId"));
				client.setcLMname(rs.getString("cLMname"));
				client.setcLMsex(rs.getString("cLMsex"));
				client.setcLMbirthday(rs.getString("cLMbirthday"));
				client.setcLMdepartment(rs.getString("cLMdepartment"));
				client.setcLMpost(rs.getString("cLMpost"));
				client.setcLMphone(rs.getString("cLMphone"));
				client.setcLMe_mai(rs.getString("cLMe_mai"));
				client.setcLMid(rs.getInt("CLMid"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Database.Close();
		return client;
	}

	@Override//添加客户
	public void addClientLinkman(Client_Linkman client) {
		
	}

	@Override//更新客户信息
	public void updataClientLinkman(Client_Linkman client) {
		Connection conn=Database.getConnection();
		String sql="update client_linkman set CLMname=?,CLMsex=?,CLMbirthday=?,CLMdepartment=?,"
				+ "CLMpost=?,CLMphone=?,CLMe_mai=? where ClientId=?";
		try {
			pstam=conn.prepareStatement(sql);
			//pstam.setInt(9, client.getcLMid());
			pstam.setString(1, client.getcLMname());
			pstam.setString(2, client.getcLMsex());
			pstam.setString(3, client.getcLMbirthday());
			pstam.setString(4, client.getcLMdepartment());
			pstam.setString(5, client.getcLMpost());
			pstam.setString(6, client.getcLMphone());
			pstam.setString(7, client.getcLMe_mai());
			pstam.setInt(8, client.getclientId());

			pstam.executeUpdate();
			
			sql="update client_basic_message set link_man=? where client_id=?";			
			pstam=conn.prepareStatement(sql);
			
			pstam.setString(1, client.getcLMname());
			pstam.setInt(2, client.getclientId());
			pstam.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Database.Close();				
	}

	@Override//删除客户
	public void deleteClientLinkman(int id) {
		
		String sql="delete from client_linkman where ClientId=?";
		Connection conn=Database.getConnection();
		try {
			pstam=conn.prepareStatement(sql);
			pstam.setInt(1, id);
			pstam.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
