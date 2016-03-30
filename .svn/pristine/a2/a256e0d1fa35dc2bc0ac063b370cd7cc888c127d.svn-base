package com.crm.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class reset_Admin_pwd_Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void destroy() {
		super.destroy(); 
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		if (!(request.getParameter("SApwd").equals("")||request.getParameter("SApwd_confirm").equals(""))) {
			if (request.getParameter("SApwd").equals(request.getParameter("SApwd_confirm"))) {
				String id=(String) request.getParameter("id");
				String password=request.getParameter("SApwd");
				BussinessService bs=new BussinessService_Impl();
				bs.resetSApsw(id, password);
				request.getRequestDispatcher("/WEB-INF/reset_Admin_pwd.jsp?message=2").forward(request, response);
			}else {
				request.getRequestDispatcher("/WEB-INF/reset_Admin_pwd.jsp?message=0").forward(request, response);
			}
			
		}
		else {
			request.getRequestDispatcher("/WEB-INF/reset_Admin_pwd.jsp?message=1").forward(request, response);
		}
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}


	public void init() throws ServletException {
	}

}
