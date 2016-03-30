package com.crm.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crm.domain.Client_Basic;
import com.crm.domain.Client_Linkman;
import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;
import com.sun.mail.handlers.message_rfc822;

public class client_Admin_Servlet extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); 
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String message=request.getParameter("message");

		String name=request.getParameter("id");
		
		if(message!=null && message.equals("search") && name!=null && !name.equals("")){

			System.out.println(name);
			BussinessService_Impl service=new BussinessService_Impl();
			List<Client_Basic> client=service.findAllClient(name);
			request.setAttribute("client", client);
			request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);		}
		else{
			
			//查找所有客户 
			BussinessService_Impl service=new BussinessService_Impl();
			List<Client_Basic> client=service.findAllClient();
			request.setAttribute("client", client);
			request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
			
		}
		
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
