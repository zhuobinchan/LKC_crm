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
		out = new FileOutputStream(tempfile);//通过输出流向文件写入数据
		byte b[] = new byte[1024];
		int len;
		while((len = in.read(b)) > 0){
			out.write(b, 0, len);
		}
		out.close();
		in.close();
		RandomAccessFile random = new RandomAccessFile(tempfile, "r");//只读
		random.readLine();//读取一行
		String str = random.readLine();//再读取一行，定位到第二行
		
		int baginIndex = str.lastIndexOf("=")+2;
		int endIndex = str.lastIndexOf("\"");
		System.out.println(str.substring(baginIndex, endIndex));
		String filename = new String(str.substring(baginIndex, endIndex).getBytes("ISO-8859-1"),"utf-8");
		//对提交的字符串进行解码，再按utf-8对byte数组构造成支持中文的字符串
		//System.out.println(filename);
		//重新定位文件指向文件头
		random.seek(0);
		long startPosition = 0;
		int i = 1;
		while((len = random.readByte()) != -1 && i <= 4){
			if(len == '\n'){
				startPosition = random.getFilePointer();
				i ++;
			}
		}
	   startPosition = startPosition;//到此为文件开始位置
	   
	   //开始定位文件结束位置
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
	   //设置上传文件的路径
	   String realpath = getServletContext().getRealPath("/")+"/upload";
	   File fileupload = new File(realpath);
	   if(!fileupload.exists()){//如果要文件的目录不存在，则新建个目录(目录)
		   fileupload.mkdir();
	   }
	   File saveFile = new File(realpath,filename);//包含文件内容的文件
	   RandomAccessFile ra = new RandomAccessFile(saveFile, "rw");//支持读写操作
	   
	   random.seek(startPosition);//定向到文件开头
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
	   
	   
	   request.setAttribute("message","上传成功");
	   response.sendRedirect(request.getContextPath()+"/servlet/Upload_contract_servlet");
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}


	public void init() throws ServletException {
	}

}
