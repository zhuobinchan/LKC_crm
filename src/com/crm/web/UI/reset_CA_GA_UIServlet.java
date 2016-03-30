package com.crm.web.UI;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class reset_CA_GA_UIServlet extends HttpServlet {

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("GAId")!=null) {
			request.setAttribute("GAId", request.getParameter("GAId"));
			request.getRequestDispatcher("/WEB-INF/reset_GA_pwd.jsp").forward(request, response);
		}
		if (request.getParameter("CAId")!=null) {
			request.setAttribute("CAId", request.getParameter("CAId"));
			request.getRequestDispatcher("/WEB-INF/reset_CA_pwd.jsp").forward(request, response);
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
