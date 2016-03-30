package com.crm.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crm.domain.Client_Linkman;
import com.crm.domain.Goods;
import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class goods_search_servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public void destroy() {
		super.destroy();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BussinessService service=new BussinessService_Impl();
		
		String gid=request.getParameter("gid");
		Goods goods=service.findGoods(gid);
		request.setAttribute("goods",goods);		
		request.getRequestDispatcher("/WEB-INF/goods_update.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void init() throws ServletException {
	}

}
