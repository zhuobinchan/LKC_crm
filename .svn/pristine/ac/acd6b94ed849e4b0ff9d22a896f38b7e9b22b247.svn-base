package com.crm.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class delete_feedbackServlet extends HttpServlet {

	private PreparedStatement pstam;
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String fbid=request.getParameter("fBid");
		System.out.println(fbid);
		BussinessService bs=new BussinessService_Impl();
		bs.deleteFeedBack(fbid);
		request.getRequestDispatcher("/servlet/feedbackUIServlet").forward(request, response);;
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
