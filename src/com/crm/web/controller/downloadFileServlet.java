package com.crm.web.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class downloadFileServlet extends HttpServlet {


	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 response.setCharacterEncoding("text/html;charset=utf-8");
		 String filename = new String(request.getParameter("filename").getBytes("ISO-8859-1"),"utf-8");
		 System.out.println(filename);
			String path = this.getServletContext().getRealPath("/upload/"+filename);//¾ø¶ÔÂ·¾¶
			System.out.println(path);
			String name = path.substring(path.lastIndexOf("\\")+1);
			
			response.setHeader("content-disposition", "attachment;filename="+URLEncoder.encode(name,"utf-8"));
			InputStream in = null;
			OutputStream out = null;
			
			in = new FileInputStream(path);
			int len = 0;
			byte[] buffer = new byte[1024];
			
			out = response.getOutputStream();
			while((len = in.read(buffer)) > 0){
				out.write(buffer,0,len);
			}
			out.close();
			in.close();
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}


	public void init() throws ServletException {
	}

}
