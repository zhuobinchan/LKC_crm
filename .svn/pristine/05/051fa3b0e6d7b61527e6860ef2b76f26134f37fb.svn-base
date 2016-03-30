package com.crm.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crm.domain.Goods;
import com.crm.service.impl.BussinessService_Impl;

public class goods_Admin_Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void destroy() {
		super.destroy();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BussinessService_Impl service=new BussinessService_Impl();
		List<Goods> goods=service.findAllGoods();
		request.setAttribute("goods",goods);
		request.getRequestDispatcher("/WEB-INF/goods_admin.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void init() throws ServletException {
		
	}

}
