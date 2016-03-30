package com.crm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database implements Driver{
	private static Connection con=null;
	private static Statement stat=null;
	private static ResultSet rs=null;
	
	public static Connection getConnection()
	{
		try
		{
			Class.forName(drivername);
			con = DriverManager.getConnection(url,user,password);
			return con;
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public static Statement openStatement()
	{	
		try
		{
			stat=getConnection().createStatement();
			return stat;
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	public static int update(String sql)
	{
		try 
		{	
			return openStatement().executeUpdate(sql);
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return -1;
	}
	public static ResultSet query(String sql)
	{
		try 
		{
			rs=openStatement().executeQuery(sql);
			return 	rs;
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}	
		return null;
	}
	public static void Close()
	{
		try 
		{
			if(rs != null) 
			{
				rs.close();
				rs = null;
			}
			if(stat != null) 
			{
				stat.close();
				stat = null;
			}
			if(con!= null) 
			{
				con.close();
				con = null;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}


