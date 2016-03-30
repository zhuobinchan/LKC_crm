package com.crm.dao.impl;

import java.sql.SQLException;

import com.crm.dao.Goods_Admin_Dao;
import com.crm.jdbc.Database;
import com.crm.utils.ServiceUtils;
import com.mysql.jdbc.ResultSet;

public class Goods_Admin_Impl implements Goods_Admin_Dao {
	
	public boolean logincheck_goods(String id,String password){//商品管理员登陆类
		String sql="select GAid,GApsw from goods_admin where GAid="+id;
		ResultSet rs=(ResultSet) Database.query(sql);
		try{
			while(rs.next()){
				String passwordMD5=ServiceUtils.md5(password);
				if(passwordMD5.equals(rs.getString("GApsw"))){
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
