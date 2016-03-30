package com.crm.web.UI;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crm.domain.Client_Basic;
import com.crm.domain.Client_Linkman;
import com.crm.domain.Feedback;
import com.crm.domain.My_Linkman;
import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class feedbackUIServlet extends HttpServlet {


	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		BussinessService bs=new BussinessService_Impl();
		List<Feedback>allFeedbacks =bs.getAllFeedbacks();
		List<Client_Basic> allClient_Basics=bs.findAllClient();
		List<My_Linkman> allMy_Linkmans=bs.findAllMy_Linkman();
		List<Client_Linkman> allClient_Linkmans=bs.findAllClientLinkmans();
		request.setAttribute("allFeedBacks", allFeedbacks);
		request.setAttribute("ACB", allClient_Basics);
		request.setAttribute("AML", allMy_Linkmans);
		request.setAttribute("ACL", allClient_Linkmans);
		request.getRequestDispatcher("/WEB-INF/feedback.jsp").forward(request, response);
	
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
doGet(request, response);
		
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
