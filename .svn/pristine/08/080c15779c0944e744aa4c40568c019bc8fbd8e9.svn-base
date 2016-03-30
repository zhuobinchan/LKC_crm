package com.crm.web.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;





import com.crm.domain.Client_Admin;
import com.crm.domain.Goods_Admin;
import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class add_Admin_Servlet extends HttpServlet {

	public void destroy() {
		super.destroy();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		
		
		if (request.getParameter("message").equals("addCA")) {
			Client_Admin CA=new Client_Admin();
			try {
				// 把request中的数据整到bean中
				Enumeration enumeration = request.getParameterNames();
				while (enumeration.hasMoreElements()) {
					String userParam = (String) enumeration.nextElement();
					String value = request.getParameter(userParam);
					System.out.println(value);
					try {
						BeanUtils.setProperty(CA, userParam, value);
					} catch (InvocationTargetException e) {
						throw new RuntimeException();
					}// 把request中对应属性的名称的值反射到与bean中相应的属性中（类似jsp：setProperty中的*通配符）
				}
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}//把request中对应属性的名称的值反射到与bean中相应的属性中（类似jsp：setProperty中的*通配符）
			
			BussinessService bs=new BussinessService_Impl();
			bs.addClient_Admin(CA);
			request.getRequestDispatcher("/servlet/system_adminServlet").forward(request, response);
			
		}
		if (request.getParameter("message").equals("addGA")) {
			Goods_Admin GA=new Goods_Admin();
			try {
				// 把request中的数据整到bean中
				Enumeration enumeration = request.getParameterNames();
				while (enumeration.hasMoreElements()) {
					String userParam = (String) enumeration.nextElement();
					String value = request.getParameter(userParam);
					System.out.println(value);
					try {
						BeanUtils.setProperty(GA, userParam, value);
					} catch (InvocationTargetException e) {
						throw new RuntimeException();
					}// 把request中对应属性的名称的值反射到与bean中相应的属性中（类似jsp：setProperty中的*通配符）
				}
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}//把request中对应属性的名称的值反射到与bean中相应的属性中（类似jsp：setProperty中的*通配符）
			
			BussinessService bs=new BussinessService_Impl();
			bs.addGood_Admin(GA);
			request.getRequestDispatcher("/servlet/system_adminServlet?message=good").forward(request, response);
			
		}
		
		
		
		
		
		
	}
		
		
		
		
	

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	public void init() throws ServletException {
		
	}

}
