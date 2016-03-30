package com.crm.dao.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.CellType;
import jxl.NumberCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import com.crm.domain.Client_Basic;
import com.crm.dao.Client_Basic_Dao;
import com.crm.jdbc.Database;
import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;
import com.jspsmart.upload.SmartUpload;


public class Client_Basic_Impl implements Client_Basic_Dao {

	private PreparedStatement pstam;
	//查找所有客户，保存到all_Client中
	@Override
	public List<Client_Basic> getClient_Basic() {
		
		List<Client_Basic> all_Client=new ArrayList<Client_Basic>();
		Client_Basic client=null;
		
		String sql="select * from client_basic_message";
		ResultSet rs=Database.query(sql);
		
		try {
			
			while(rs.next()){
				client=new Client_Basic();		
				//客户基本资料
				client.setClient_id(rs.getInt("client_id"));
				client.setClient_name(rs.getString("client_name"));
				client.setE_mail(rs.getString("e_mail"));
				client.setFax(rs.getString("fax"));
				client.setLegal_represent(rs.getString("legal_represent"));
				client.setRegistration_time(rs.getString("registration_time"));
				client.setTelephone(rs.getString("telephone"));
				client.setTrack_route(rs.getString("track_route"));
				//客户详细资料
				client.setCity(rs.getString("city"));
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
				client.setLink_man(rs.getString("link_man"));
				all_Client.add(client);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Database.Close();
		return all_Client;
	}

	//添加新的客户
	@Override
	public void addClient(Client_Basic client) {
		
		Connection conn=Database.getConnection();
		String sql="INSERT client_basic_message (client_id,client_name,e_mail,fax,legal_represent,registration_time,telephone,track_route,"
				+ "client_grade,client_type,client_industry,client_property,district,city,province,"
				+ "bank,credit,bank_account,remark,link_man) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstam=conn.prepareStatement(sql);
			pstam.setInt(1, client.getClient_id());
			pstam.setString(2, client.getClient_name());
			pstam.setString(3, client.getE_mail());
			pstam.setString(4, client.getFax());
			pstam.setString(5, client.getLegal_represent());
			pstam.setString(6, client.getRegistration_time());
			pstam.setString(7, client.getTelephone());
			pstam.setString(8, client.getTrack_route());
			
			pstam.setInt(9, client.getClient_grade());
			pstam.setString(10, client.getClient_type());
			pstam.setString(11, client.getClient_industry());
			pstam.setString(12, client.getClient_property());
			pstam.setString(13, client.getDistrict());
			pstam.setString(14, client.getCity());
			pstam.setString(15, client.getProvince());
			pstam.setString(16, client.getBank());
			pstam.setString(17, client.getCredit());
			pstam.setInt(18, client.getBank_account());
			pstam.setString(19, client.getRemark());
			pstam.setString(20, client.getLink_man());
			
			
			pstam.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Database.Close();
		

	}
	
	

	@Override
	public void deleteClient(int id) {
		
		String sql="delete from client_basic_message where client_id=?";
		Connection conn=Database.getConnection();
		try {
			pstam=conn.prepareStatement(sql);
			pstam.setInt(1, id);
			pstam.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override//查找单个客户的基本信息
	public Client_Basic getClientBasic(int id) {
		
		Client_Basic client=null;
		
		String sql="select * from client_basic_message where client_id='"+id+"'";
		ResultSet rs=Database.query(sql);
		
		try {
			
			while(rs.next()){
				client=new Client_Basic();				
				client.setClient_id(rs.getInt("client_id"));
				client.setClient_name(rs.getString("client_name"));
				client.setE_mail(rs.getString("e_mail"));
				client.setFax(rs.getString("fax"));
				client.setLegal_represent(rs.getString("legal_represent"));
				client.setRegistration_time(rs.getString("registration_time"));
				client.setTelephone(rs.getString("telephone"));
				client.setTrack_route(rs.getString("track_route"));			
				
				client.setCity(rs.getString("city"));
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
				client.setLink_man(rs.getString("link_man"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Database.Close();
		return client;
	}

	@Override//更新客户信息
	public void updataClient(Client_Basic client) {

		Connection conn=Database.getConnection();
		String sql="update client_basic_message set client_name=?,e_mail=?,fax=?,legal_represent=?,registration_time=?,telephone=?,track_route=?,client_grade=?,client_type=?,client_industry=?,"
				+ "client_property=?,district=?,city=?,province=?,bank_account=?,bank=?,credit=?,remark=?"
				+"where client_id=?";
		try {
			pstam=conn.prepareStatement(sql);
			//pstam.setInt(1, client.getClient_id());
			pstam.setString(1, client.getClient_name());
			pstam.setString(2, client.getE_mail());
			pstam.setString(3, client.getFax());
			pstam.setString(4, client.getLegal_represent());
			pstam.setString(5, client.getRegistration_time());
			pstam.setString(6, client.getTelephone());
			pstam.setString(7, client.getTrack_route());

			pstam.setInt(8, client.getClient_grade());
			pstam.setString(9, client.getClient_type());
			pstam.setString(10, client.getClient_industry());
			pstam.setString(11, client.getClient_property());
			pstam.setString(12, client.getDistrict());
			pstam.setString(13, client.getCity());
			pstam.setString(14, client.getProvince());
			pstam.setInt(15, client.getBank_account());
			pstam.setString(16, client.getBank());
			pstam.setString(17, client.getCredit());
			pstam.setString(18, client.getRemark());
			pstam.setInt(19, client.getClient_id());
			pstam.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Database.Close();		
	}

	@Override
	public List<Client_Basic> getClient_Basic(String name) {
		List<Client_Basic> all_Client=new ArrayList<Client_Basic>();
		Client_Basic client=null;
		
		String sql="select * from client_basic_message where link_man='"+name+"'";
		ResultSet rs=Database.query(sql);
		
		try {
			
			while(rs.next()){
				client=new Client_Basic();		
				//客户基本资料
				client.setClient_id(rs.getInt("client_id"));
				client.setClient_name(rs.getString("client_name"));
				client.setE_mail(rs.getString("e_mail"));
				client.setFax(rs.getString("fax"));
				client.setLegal_represent(rs.getString("legal_represent"));
				client.setRegistration_time(rs.getString("registration_time"));
				client.setTelephone(rs.getString("telephone"));
				client.setTrack_route(rs.getString("track_route"));
				//客户详细资料
				client.setCity(rs.getString("city"));
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
				client.setLink_man(rs.getString("link_man"));
				all_Client.add(client);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Database.Close();
		return all_Client;
	}
	
	 @Override
	public void ExcelClient(String filePath) throws BiffException, IOException{
    	 
		 InputStream in = new FileInputStream(filePath);
			Workbook wbk = Workbook.getWorkbook(in);//构建workbook
		    Sheet sheet = wbk.getSheet(0);//得到表
 	     List<Client_Basic> list = new ArrayList<Client_Basic>();
 	     for(int i = 1; i < sheet.getRows(); i ++){
 	    	Client_Basic cb = new Client_Basic();
 	    	
 	    	 Cell cell1 = sheet.getCell(0, i);// 对应单元格
 				NumberCell nCell = (NumberCell) cell1;
 				int Clieny_id = (int) nCell.getValue();
 	           cb.setClient_id(Clieny_id);
 	           
 	           Cell cell2 = sheet.getCell(1, i);
 	           String name = cell2.getContents();
 	           cb.setClient_name(name);
 	           
 	           Cell cell3 = sheet.getCell(2, i);
 	           String legal_represent = cell2.getContents();
 	           cb.setLegal_represent(legal_represent);
 	           
 	           
 	           Cell cell4 = sheet.getCell(3, i);
 	           String telephone = cell4.getContents();
 	           cb.setTelephone(telephone);
 	           
 	           
 	           
 	           Cell cell5 = sheet.getCell(4, i);
 	           String e_mail = cell5.getContents();
 	           cb.setE_mail(e_mail);
 	           
 	           
 	           
 	           Cell cell6 = sheet.getCell(5, i);
 	           String link_man = cell6.getContents();
 	           cb.setLink_man(link_man);
 	           
 	           Cell cell7 = sheet.getCell(6, i);
 	           NumberCell nCell33 = (NumberCell) cell7;
 	           int bank_account = (int) nCell33.getValue();
 	           cb.setBank_account(bank_account);
 	           

 	       
	           
	           
	         
 	                 	           
 	         //  list.add(cb);   
 	          BussinessService service=new BussinessService_Impl();
 	 	     service.addClientBasic(cb);
 	     }
 	 		   			
 	    
			   wbk.close();   	 
			   in.close();
	}
	 
	 
	
     }
