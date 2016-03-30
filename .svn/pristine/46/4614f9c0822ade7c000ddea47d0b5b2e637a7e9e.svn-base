package com.crm.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crm.domain.Client_Admin;
import com.crm.domain.Goods_Admin;
import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class system_adminServlet extends HttpServlet {

	public void destroy() {
		super.destroy(); 
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BussinessService bs=new BussinessService_Impl();
		
		
		
		if(request.getParameter("message")!=null&&request.getParameter("message").equals("good")){
		
			List<Goods_Admin> allGoods_Admins=bs.allGoods_Admins();
			request.setAttribute("allGood_admins", allGoods_Admins);
			request.setAttribute("message", "good");
			request.getRequestDispatcher("/WEB-INF/system_admin.jsp").forward(request, response);
		}else {
			
			List<Client_Admin> allClient_Admins=bs.AllClient_Admins();
			request.setAttribute("allClient_Admins", allClient_Admins);
			request.getRequestDispatcher("/WEB-INF/system_admin.jsp").forward(request, response);
			
		}
		
		
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}


	public void init() throws ServletException {
	}

}
