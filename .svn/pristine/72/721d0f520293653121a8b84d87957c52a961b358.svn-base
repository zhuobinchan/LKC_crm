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
import com.crm.domain.Relationship_Record;
import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class linkrecordServlet extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		BussinessService bs=new BussinessService_Impl();
		List<Relationship_Record>allRecord =bs.findLinkRecord();
		List<Client_Basic> allClient_Basics=bs.findAllClient();
		List<My_Linkman> allMy_Linkmans=bs.findAllMy_Linkman();
		List<Client_Linkman> allClient_Linkmans=bs.findAllClientLinkmans();
		request.setAttribute("allRecord", allRecord);
		request.setAttribute("ACB", allClient_Basics);
		request.setAttribute("AML", allMy_Linkmans);
		request.setAttribute("ACL", allClient_Linkmans);
		request.getRequestDispatcher("/WEB-INF/link_record.jsp").forward(request, response);
	
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
