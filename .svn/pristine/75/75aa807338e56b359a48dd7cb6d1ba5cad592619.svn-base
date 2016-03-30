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

import com.crm.dao.Contract_Dao;
import com.crm.domain.Contract;
import com.crm.domain.Files;
import com.crm.jdbc.Database;

public class Contract_Impl implements Contract_Dao {
		private Database ds = null;
	    private Connection conn = null;
	    private PreparedStatement pstm = null;
		@Override
		public List<Contract> allContracts() {
			
			List<Contract> allContracts=new ArrayList<Contract>();
			Contract contracts=null;
			
			String sql="select * from contract";
			ResultSet rs=Database.query(sql);
			
			try {
				while (rs.next()) {
					contracts=new Contract();
					contracts.setContract_id(rs.getInt("contract_id"));
					contracts.setContract_time(rs.getDate("contract_time").toString());
					contracts.setContract_name(rs.getString("contract_name"));
					contracts.setContract_user(rs.getString("contract_user"));
					allContracts.add(contracts);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return allContracts;
		}

		@Override
		public boolean updatecontract(String upusername, String upfilename,
				String updata) {
			ds = new Database();
			conn = Database.getConnection();
			String sql = "INSERT contract(contract_user,contract_name,contract_time) VALUES(?,?,?)";
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
