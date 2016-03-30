package com.crm.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.crm.dao.Relationship_Record_Dao;
import com.crm.domain.Client_Basic;
import com.crm.domain.Relationship_Record;
import com.crm.jdbc.Database;

public class Relationship_Record_Impl implements Relationship_Record_Dao {

	private PreparedStatement pstam;
	
	@Override
	public List<Relationship_Record> getRelationship_Record() {
		List<Relationship_Record> all_Client=new ArrayList<Relationship_Record>();
		Relationship_Record record=null;
		
		String sql="select * from relationship_record";
		ResultSet rs=Database.query(sql);
		
		try {
			
			while(rs.next()){
				record=new Relationship_Record();		
				//客户基本资料
				record.setClientId(rs.getInt("ClientId"));
				record.setcLMid(rs.getInt("CLMid"));
				record.setMyLMid(rs.getInt("MyLMid"));
				record.setrCdate(rs.getString("RCdate"));
				record.setrCid(rs.getInt("RCid"));
				record.setrCtext(rs.getString("RCtext"));
				record.setrCtype(rs.getString("RCtype"));
				all_Client.add(record);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Database.Close();
		return all_Client;
	}

	@Override
	public void addRelationship_Record(Relationship_Record record) {
		
		Connection conn=Database.getConnection();
		String sql="INSERT relationship_record (RCtext,RCdate,ClientId,CLMid,RCtype,myLMid) values (?,?,?,?,?,?)";
		try {
			pstam=conn.prepareStatement(sql);
			pstam.setString(1, record.getrCtext());
			pstam.setString(2, record.getrCdate());
			pstam.setInt(3, record.getClientId());
			pstam.setInt(4, record.getcLMid());
			pstam.setString(5, record.getrCtype());
			pstam.setInt(6, record.getMyLMid());
			pstam.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Database.Close();	
	}

	@Override
	public void deleteRelationship_Record(int id) {
		
		String sql="delete from relationship_record where RCid=?";
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
