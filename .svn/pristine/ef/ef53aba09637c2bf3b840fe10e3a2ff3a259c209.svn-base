package com.crm.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.FinderException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crm.domain.Client_Basic;
import com.crm.domain.Client_Detail;
import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class client_detail_servlet extends HttpServlet {


	public void destroy() {
		super.destroy(); 
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String client_id=request.getParameter("client_id");
		BussinessService service=new BussinessService_Impl();
		Client_Basic client_Basic=service.findClientBasic(Integer.parseInt(client_id));
		request.setAttribute("client_Basic", client_Basic);
		request.getRequestDispatcher("/WEB-INF/client_detail.jsp").forward(request, response);
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
