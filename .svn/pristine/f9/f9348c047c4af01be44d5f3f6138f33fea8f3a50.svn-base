package junit.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.NumberCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.junit.Test;

import com.crm.domain.Client_Basic;
import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class ExText {

	@Test
	public void T() throws IOException, BiffException{
		 InputStream in = new FileInputStream("C:\\Users\\HP-ENVY4\\Desktop\\aaa.xls");
			Workbook wbk = Workbook.getWorkbook(in);//构建workbook
		    Sheet sheet = wbk.getSheet(0);//得到表
 	     List<Client_Basic> list = new ArrayList<Client_Basic>();
 	     for(int i = 0; i < sheet.getRows(); i ++){
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
 	           String fax = cell6.getContents();
 	           cb.setFax(fax);
 	           
 	           Cell cell7 = sheet.getCell(6, i);
 	           String registration_time = cell6.getContents();
 	           cb.setRegistration_time(registration_time);
 	           
 	           Cell cell8 = sheet.getCell(7, i);
 	           String track_route = cell6.getContents();
 	           cb.setTrack_route(track_route);
 	        
 	           Cell cell9 = sheet.getCell(8, i);
 	            NumberCell nCell2 = (NumberCell) cell9;
 	           int client_grade = (int) nCell2.getValue();
 	           System.out.println(client_grade+"55555");
 	           cb.setClient_grade(client_grade);
 	    
 	     
 	           Cell cell10 = sheet.getCell(9, i);
 	           String client_type = cell10.getContents();
 	           cb.setClient_type(client_type);
 	           
 	           Cell cell11 = sheet.getCell(10, i);
 	           String client_industry = cell11.getContents();
 	           cb.setClient_industry(client_industry);
 	           
 	           
 	           Cell cell12 = sheet.getCell(11, i);
 	           String client_property = cell12.getContents();
 	           cb.setClient_property(client_property);
 	           
 	           
 	           Cell cell13 = sheet.getCell(12, i);
 	           String district = cell13.getContents();
 	           cb.setDistrict(district);
 	           
 	           
 	          Cell cell14 = sheet.getCell(13, i);
	           String city = cell13.getContents();
	           cb.setCity(city);
	           
	           
	           Cell cell15 = sheet.getCell(14, i);
	           String province = cell15.getContents();	          
 	           cb.setProvince(province);
 	           
 	         Cell cell16 = sheet.getCell(15, i);
 	          NumberCell nn = (NumberCell) cell16;
	          int bank_account = (int) nn.getValue();
	          cb.setBank_account(bank_account);
	           
	          
	           
	           Cell cell17 = sheet.getCell(16, i);
 	           String bank = cell13.getContents();
 	           cb.setBank(bank);
 	           
 	           
 	           
 	          Cell cell18 = sheet.getCell(17, i);
	           String credit = cell13.getContents();
	           cb.setCredit(credit);
	           
	           
	           Cell cell19 = sheet.getCell(18, i);
 	           String remark = cell13.getContents();
 	           cb.setRemark(remark);
 	           
	           Cell cell20 = sheet.getCell(19, i);
 	           String linkman = cell13.getContents();
 	           cb.setLink_man(linkman);
 	           
 	       
	           
	           
	         
 	                 	           
 	         //  list.add(cb);   
 	          BussinessService service=new BussinessService_Impl();
 	 	     service.addClientBasic(cb);
 	     }
 	 		   			
 	    
			   wbk.close();   	 
			   in.close();
	}
		
	}
	

