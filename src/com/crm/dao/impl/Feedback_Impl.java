package com.crm.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.crm.dao.Feedback_Dao;
import com.crm.domain.Feedback;
import com.crm.jdbc.Database;

public class Feedback_Impl implements Feedback_Dao {
	private PreparedStatement pstam;
	@Override
	public List<Feedback> allFeedbacks() {
		String sql="select * from feedback";
		ResultSet rs=Database.query(sql);
		
		Feedback fb=null;
		List<Feedback> all=new ArrayList<Feedback>();
		try {
			while (rs.next()) {
				fb=new Feedback();
				fb.setfBid(rs.getInt("FBid"));
				fb.setfBtitle(rs.getString("FBtitle"));
				fb.setMyLMid(rs.getInt("myLMid"));
				fb.setClientId(rs.getInt("ClientId"));
				fb.setcLMid(rs.getInt("CLMid"));
				fb.setfBtype(rs.getString("FBtype"));
				fb.setfBsearch_date(rs.getDate("FBsearch_date").toString());
				fb.setfBback_date(rs.getDate("FBback_date").toString());
				fb.setfBremack(rs.getString("FBremack"));
				all.add(fb);
			}
			return all;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void addFeedbacks(Feedback feedback) {
		
		Connection conn=Database.getConnection();
		String sql="INSERT feedback (FBtitle,myLMid,ClientId,CLMid,FBtype,FBsearch_date,FBback_date,FBremack) values (?,?,?,?,?,?,?,?)";
		try {
			pstam=conn.prepareStatement(sql);
			pstam.setString(1, feedback.getfBtitle());
			pstam.setInt(2, feedback.getMyLMid());
			pstam.setInt(3, feedback.getClientId());
			pstam.setInt(4, feedback.getcLMid());
			pstam.setString(5, feedback.getfBtype());
			pstam.setString(6, feedback.getfBsearch_date());
			pstam.setString(7, feedback.getfBback_date());
			pstam.setString(8, feedback.getfBremack());
			pstam.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Database.Close();		
		
		
	}

	@Override
	public boolean deleteFeedback(String fbId) {

		String sql="delete from feedback where FBid=?";
		Connection conn=Database.getConnection();
		try {
			pstam=conn.prepareStatement(sql);
			pstam.setString(1, fbId);
			pstam.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

}
