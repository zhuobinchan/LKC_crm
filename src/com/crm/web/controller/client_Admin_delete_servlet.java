package com.crm.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class client_Admin_delete_servlet extends HttpServlet {


	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id=Integer.parseInt(request.getParameter("id"));
		BussinessService service=new BussinessService_Impl();
		service.deleteClient(id);
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
