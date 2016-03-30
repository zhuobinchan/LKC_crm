package com.crm.web.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import com.crm.domain.Client_Basic;
import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

public class ExportExcelServlet extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			 File file = new File("kkk.xls");
			WritableWorkbook wb = Workbook.createWorkbook(new File("C:\\Users\\HP-ENVY4\\Desktop\\客户信息.xls"));
			// OutputStream out = new FileOutputStream(file);
			//	WritableWorkbook wb = Workbook.createWorkbook(out);
				
				//创建工作表
				//表名和索引号（表示第几个工作表）
				WritableSheet ws = wb.createSheet("Customer",0);
			
				Label label = new Label(0, 0, "客户编号");
			 Label label2 = new Label(1, 0, "客户姓名");//列  行  内容
			  Label label3 = new Label(2, 0, "法人代表");
			  Label label4 = new Label(3, 0, "电话");
			    Label label5 = new Label(4, 0, "电子邮件");
			    Label label6 = new Label(5, 0, "联系人");
			    Label label7 = new Label(6, 0, "银行帐号");

			    try {
					ws.addCell(label);
					 ws.addCell(label2);
					    ws.addCell(label3);
					    ws.addCell(label4);
					    ws.addCell(label5);
					    ws.addCell(label6);
					    ws.addCell(label7);
					    
					    
						//response.setHeader("content-disposition", "attachment;filename="+"55.xls");
					   /* SmartUpload su = new SmartUpload();
						su.setContentDisposition(null);
						su.initialize(getServletConfig(), request, response);		
							su.downloadFile("file");//将图片的名称存入数据库*/
					
				} catch (RowsExceededException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (WriteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    
			    
			    BussinessService service=new BussinessService_Impl();
			    
			    List<Client_Basic> client=service.findAllClient();
			    
			    for (int i = 0; i < client.size(); i++) {
					Client_Basic client1=client.get(i);
					
					Label client_id = new Label(0,i+1, String.valueOf(client1.getClient_id()));
					Label client_name = new Label(1,i+1, client1.getClient_name());
					Label legal_represent = new Label(2,i+1, client1.getLegal_represent());
					Label telephone = new Label(3,i+1, client1.getTelephone());
					Label e_mail = new Label(4,i+1, client1.getE_mail());
					Label link_man = new Label(5,i+1, client1.getLink_man());
					Label bank_account = new Label(6,i+1, String.valueOf(client1.getBank_account()));
						
				    try {
						ws.addCell(client_id);
						 ws.addCell(client_name);
						    ws.addCell(legal_represent);
						    ws.addCell(telephone);
						    ws.addCell(e_mail);
						    ws.addCell(link_man);
						    ws.addCell(bank_account);
						    
						    
							//response.setHeader("content-disposition", "attachment;filename="+"55.xls");
						   /* SmartUpload su = new SmartUpload();
							su.setContentDisposition(null);
							su.initialize(getServletConfig(), request, response);		
								su.downloadFile("file");//将图片的名称存入数据库*/
						
					} catch (RowsExceededException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (WriteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}

			    wb.write();//写入
			    try {
					wb.close();
				} catch (WriteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		request.getRequestDispatcher("/servlet/client_Admin_Servlet").forward(request, response);	   
			    
			
			 
}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         doGet(request, response);
	
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
