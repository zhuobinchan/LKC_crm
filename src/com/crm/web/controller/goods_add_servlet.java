package com.crm.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.crm.domain.Client_Basic;
import com.crm.domain.Goods;
import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class goods_add_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void destroy() {
		super.destroy(); 
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Goods goods=null;
		goods=new Goods();
		Enumeration<String> paraNames=request.getParameterNames();	
		for(Enumeration e=paraNames;e.hasMoreElements();){
		    try { 
		       String thisName=e.nextElement().toString();
		       String thisValue=request.getParameter(thisName);
				       if (!thisName.equals("gprice")) {
							BeanUtils.setProperty(goods, thisName, thisValue);
					}else{
						Double aa=Double.parseDouble(thisValue);
						BeanUtils.setProperty(goods, thisName, aa);
					}
		       
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			} catch (InvocationTargetException e1) {
				e1.printStackTrace();
			}//把request中对应属性的名称的值反射到与bean中相应的属性中（类似jsp：setProperty中的*通配符）
		 
		}

		BussinessService service=new BussinessService_Impl();
		service.addGoods(goods);
		
		request.getRequestDispatcher("/servlet/goods_Admin_Servlet").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void init() throws ServletException {
	}

}
