package com.crm.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.crm.dao.Client_Detail_Dao;
import com.crm.domain.Client_Basic;
import com.crm.domain.Client_Detail;
import com.crm.jdbc.Database;
import com.crm.web.controller.system_adminServlet;



public class Client_Detail_Impl implements Client_Detail_Dao {

	private PreparedStatement pstam;
	
	@Override
	public List<Client_Detail> getClient_Details() {
		
		List<Client_Detail> all_Client=new ArrayList<Client_Detail>();
		Client_Detail client=null;
		
		String sql="select * from client_detail_message";
		ResultSet rs=Database.query(sql);
		
		try {

			while(rs.next()){
				
				client=new Client_Detail();				
				client.setCity(rs.getString("city"));
				client.setClient_id(rs.getInt("client_id"));
				client.setClient_grade(rs.getInt("client_grade"));
				client.setClient_type(rs.getString("client_type"));
				client.setClient_industry(rs.getString("client_industry"));
				client.setClient_property(rs.getString("client_property"));
				client.setDistrict(rs.getString("district"));
				client.setProvince(rs.getString("province"));
				client.setBank_account(rs.getInt("bank_account"));
				client.setBank(rs.getString("bank"));
				client.setCredit(rs.getString("credit"));
				client.setRemark(rs.getString("remark"));	
				all_Client.add(client);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Database.Close();
		return all_Client;
	}

	@Override
	public void addClientDetail(Client_Detail client) {
		Connection conn=Database.getConnection();
		String sql="INSERT client_detail_message (client_id,client_grade,client_type,client_industry,client_property,district,city,province,bank_account,bank,credit,remark) values (?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstam=conn.prepareStatement(sql);
			pstam.setInt(1, client.getClient_id());
			pstam.setInt(2, client.getClient_grade());
			pstam.setString(3, client.getClient_type());
			pstam.setString(4, client.getClient_industry());
			pstam.setString(5, client.getClient_property());
			pstam.setString(6, client.getDistrict());
			pstam.setString(7, client.getCity());
			pstam.setString(8, client.getProvince());
			pstam.setInt(9, client.getBank_account());
			pstam.setString(10, client.getBank());
			pstam.setString(11, client.getCredit());
			pstam.setString(12, client.getRemark());
			pstam.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Database.Close();
		
	}

	@Override
	public void deleteClientDetail(Client_Detail client) {
		
		String sql="delete from client_detail_message where client_id=?";
		Connection conn=Database.getConnection();
		try {
			pstam=conn.prepareStatement(sql);
			pstam.setInt(1, client.getClient_id());
			pstam.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override//获取单个客户的详细信息
	public Client_Detail getClientDetail(int id) {
		
		Client_Detail client=null;
		
		String sql="select * from client_detail_message where client_id='"+id+"'";
		ResultSet rs=Database.query(sql);
		
		try {

			while(rs.next()){
				
				client=new Client_Detail();				
				client.setCity(rs.getString("city"));
				client.setClient_id(rs.getInt("client_id"));
				client.setClient_grade(rs.getInt("client_grade"));
				client.setClient_type(rs.getString("client_type"));
				client.setClient_industry(rs.getString("client_industry"));
				client.setClient_property(rs.getString("client_property"));
				client.setDistrict(rs.getString("district"));
				client.setProvince(rs.getString("province"));
				client.setBank_account(rs.getInt("bank_account"));
				client.setBank(rs.getString("bank"));
				client.setCredit(rs.getString("credit"));
				client.setRemark(rs.getString("remark"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Database.Close();
		return client;
	}

}
