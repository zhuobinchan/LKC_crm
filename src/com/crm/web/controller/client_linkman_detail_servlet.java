package com.crm.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crm.domain.Client_Linkman;
import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class client_linkman_detail_servlet extends HttpServlet {


	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		BussinessService service=new BussinessService_Impl();
		int id=Integer.parseInt(request.getParameter("id"));
		Client_Linkman client_Linkman=service.findClientLinkman(id);
		request.setAttribute("client_Linkman", client_Linkman);		
		request.getRequestDispatcher("/WEB-INF/client_linkman_detail.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
