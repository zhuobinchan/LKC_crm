package com.crm.web.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;
import com.crm.utils.ServiceUtils;

public class updateContractServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void destroy() {
		super.destroy(); 
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		InputStream in = null;
		FileOutputStream out = null;		
		in = request.getInputStream();
		String tempfileload = "E:/tempfilee.txt";
		File tempfile = new File(tempfileload);
		out = new FileOutputStream(tempfile);//ͨ����������ļ�д������
		byte b[] = new byte[1024];
		int len;
		while((len = in.read(b)) > 0){
			out.write(b, 0, len);
		}
		out.close();
		in.close();
		RandomAccessFile random = new RandomAccessFile(tempfile, "r");//ֻ��
		random.readLine();//��ȡһ��
		String str = random.readLine();//�ٶ�ȡһ�У���λ���ڶ���
		
		int baginIndex = str.lastIndexOf("=")+2;
		int endIndex = str.lastIndexOf("\"");
		System.out.println(str.substring(baginIndex, endIndex));
		String filename = new String(str.substring(baginIndex, endIndex).getBytes("ISO-8859-1"),"utf-8");
		//���ύ���ַ������н��룬�ٰ�utf-8��byte���鹹���֧�����ĵ��ַ���
		//System.out.println(filename);
		//���¶�λ�ļ�ָ���ļ�ͷ
		random.seek(0);
		long startPosition = 0;
		int i = 1;
		while((len = random.readByte()) != -1 && i <= 4){
			if(len == '\n'){
				startPosition = random.getFilePointer();
				i ++;
			}
		}
	   startPosition = startPosition;//����Ϊ�ļ���ʼλ��
	   
	   //��ʼ��λ�ļ�����λ��
	   random.seek(random.length());
	   long endPosition = random.getFilePointer();
	   int j = 1;
	   while((endPosition >= 0) && j <= 6){
		   endPosition --;
		   random.seek(endPosition);
		   if(random.readByte() ==
				   '\n'){
			   j ++;
		   }
	   }
	   endPosition = endPosition - 1;
	   //�����ϴ��ļ���·��
	   String realpath = getServletContext().getRealPath("/")+"/upload";
	   File fileupload = new File(realpath);
	   if(!fileupload.exists()){//���Ҫ�ļ���Ŀ¼�����ڣ����½���Ŀ¼(Ŀ¼)
		   fileupload.mkdir();
	   }
	   File saveFile = new File(realpath,filename);//�����ļ����ݵ��ļ�
	   RandomAccessFile ra = new RandomAccessFile(saveFile, "rw");//֧�ֶ�д����
	   
	   random.seek(startPosition);//�����ļ���ͷ
	   while(startPosition < endPosition){
		   ra.write(random.read());
		   startPosition = random.getFilePointer();
	   }
	   ra.close();
	   random.close();
	  // tempfile.delete();
	   BussinessService service = new BussinessService_Impl();
	   String id=(String) request.getSession().getAttribute("id");
	   
	   service.uploadContracts(id, filename, ServiceUtils.localDate());
	   
	   
	   request.setAttribute("message","�ϴ��ɹ�");
	   response.sendRedirect(request.getContextPath()+"/servlet/Upload_contract_servlet");
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}


	public void init() throws ServletException {
	}

}
