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

public class reset_CA_GA_Servlet extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); 
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("CAId")!=null) {
			request.setCharacterEncoding("utf-8");
			
			if (!(request.getParameter("SApwd").equals("")||request.getParameter("SApwd_confirm").equals(""))) {
				if (request.getParameter("SApwd").equals(request.getParameter("SApwd_confirm"))) {
					String id=(String) request.getParameter("CAId");
					String password=request.getParameter("SApwd");
					BussinessService bs=new BussinessService_Impl();
					bs.resetCApsw(new Integer(id), password);
					request.getRequestDispatcher("/WEB-INF/reset_CA_pwd.jsp?message=2").forward(request, response);
				}else {
					request.getRequestDispatcher("/WEB-INF/reset_CA_pwd.jsp?message=0").forward(request, response);
				}
				
			}
			else {
				request.getRequestDispatcher("/WEB-INF/reset_CA_pwd.jsp?message=1").forward(request, response);
			}
			
			
		}
		if (request.getParameter("GAId")!=null) {
			if (!(request.getParameter("SApwd").equals("")||request.getParameter("SApwd_confirm").equals(""))) {
				if (request.getParameter("SApwd").equals(request.getParameter("SApwd_confirm"))) {
					String id=(String) request.getParameter("GAId");
					String password=request.getParameter("SApwd");
					BussinessService bs=new BussinessService_Impl();
					bs.resetGApsw(id, password);
					request.getRequestDispatcher("/WEB-INF/reset_GA_pwd.jsp?message=2").forward(request, response);
				}else {
					request.getRequestDispatcher("/WEB-INF/reset_GA_pwd.jsp?message=0").forward(request, response);
				}
				
			}
			else {
				request.getRequestDispatcher("/WEB-INF/reset_GA_pwd.jsp?message=1").forward(request, response);
			}
			
			
			
			
		}

	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
doGet(request, response);
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
