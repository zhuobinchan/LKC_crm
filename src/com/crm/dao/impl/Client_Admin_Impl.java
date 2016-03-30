package com.crm.dao.impl;

import java.sql.SQLException;

import com.crm.dao.Client_Admin_Dao;
import com.crm.jdbc.Database;
import com.crm.utils.ServiceUtils;
import com.mysql.jdbc.ResultSet;

public class Client_Admin_Impl implements Client_Admin_Dao {
	
	public boolean logincheck_client(String id,String password) {
		String sql="select client_admin_id,client_admin_password from client_admin where client_admin_id="+id;
		ResultSet rs=(ResultSet) Database.query(sql);
		try{
			while(rs.next()){
				String passwordMD5=ServiceUtils.md5(password);
				if(passwordMD5.equals(rs.getString("client_admin_password"))){
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
}
