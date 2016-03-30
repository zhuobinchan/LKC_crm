package com.crm.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class search_pdf_servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void destroy() {
		super.destroy(); 
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setCharacterEncoding("text/html;charset=utf-8");
		 String filename = new String(request.getParameter("filename").getBytes("ISO-8859-1"),"utf-8");
		 System.out.println(filename);
		
		String path = this.getServletContext().getRealPath("/upload/"+filename);//¾ø¶ÔÂ·¾¶
	
		String name = path.substring(path.lastIndexOf("\\")+1);
		System.out.println(path);
		
		request.getRequestDispatcher("../upload/"+filename).forward(request, response);

//		Runtime.getRuntime().exec(path);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void init() throws ServletException {
	}

}
