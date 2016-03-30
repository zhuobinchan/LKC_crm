package com.crm.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class delete_Admin_Servlet extends HttpServlet {

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("GAId")!=null) {
		
			BussinessService bs=new BussinessService_Impl();
			bs.delectGA(request.getParameter("GAId"));
			request.getRequestDispatcher("/servlet/system_adminServlet?message=good").forward(request, response);
		}
		if (request.getParameter("CAId")!=null) {
			
			BussinessService bs=new BussinessService_Impl();
			bs.deleteCA(request.getParameter("CAId"));
			request.getRequestDispatcher("/servlet/system_adminServlet").forward(request, response);
		}
	
//		request.getRequestDispatcher("/servlet/system_adminServlet").forward(request, response);
		

		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}


	public void init() throws ServletException {
	}

}
