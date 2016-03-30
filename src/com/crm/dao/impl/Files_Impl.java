package com.crm.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.crm.dao.Files_Dao;
import com.crm.domain.Files;
import com.crm.jdbc.Database;

public class Files_Impl implements Files_Dao {
    private Database ds = null;
    private Connection conn = null;
    private PreparedStatement pstm = null;
	@Override
	public List<Files> allFiles() {
		
		List<Files> allFiles=new ArrayList<Files>();
		Files files=null;
		
		String sql="select * from UploadFile";
		ResultSet rs=Database.query(sql);
		
		try {
			while (rs.next()) {
				files=new Files();
				files.setFileID(rs.getInt("upfileID"));
				files.setUpDate(rs.getDate("uptime").toString());
				files.setUpFileName(rs.getString("upName"));
				files.setUpUserName(rs.getString("upUser"));
				allFiles.add(files);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allFiles;
	}

	@Override
	public boolean updateFiles(String upusername, String upfilename,
			String updata) {
		ds = new Database();
		conn = Database.getConnection();
		String sql = "INSERT UploadFile(upUser,upName,uptime) VALUES(?,?,?)";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,upusername);
			pstm.setString(2,upfilename);
			pstm.setTimestamp(3,new Timestamp(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(updata).getTime()));
			pstm.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    
		return false;
	}

}
