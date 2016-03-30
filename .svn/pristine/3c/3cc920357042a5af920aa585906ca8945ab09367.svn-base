package com.crm.web.UI;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crm.domain.Contract;
import com.crm.domain.Files;
import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class Upload_contract_servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void destroy() {
		super.destroy();
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BussinessService service = new BussinessService_Impl();
	    List<Contract> allcontract = service.getAllContracts();
	    request.setAttribute("allcontract",allcontract);	 
		request.getRequestDispatcher("/WEB-INF/contract_list.jsp").forward(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	
	public void init() throws ServletException {
	}

}
