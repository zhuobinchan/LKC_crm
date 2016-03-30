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

import com.crm.domain.Feedback;
import com.crm.domain.Relationship_Record;
import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class add_linkrecordServlet extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		Relationship_Record fb=new Relationship_Record();
		try {
			// ��request�е���������bean��
			Enumeration enumeration = request.getParameterNames();
			while (enumeration.hasMoreElements()) {
				String userParam = (String) enumeration.nextElement();
				String value = request.getParameter(userParam);
				System.out.println(value);
				try {
					BeanUtils.setProperty(fb, userParam, value);
				} catch (InvocationTargetException e) {
					throw new RuntimeException();
				}// ��request�ж�Ӧ���Ե����Ƶ�ֵ���䵽��bean����Ӧ�������У�����jsp��setProperty�е�*ͨ�����
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}//��request�ж�Ӧ���Ե����Ƶ�ֵ���䵽��bean����Ӧ�������У�����jsp��setProperty�е�*ͨ�����
		
		BussinessService bs=new BussinessService_Impl();
		bs.addLinkRecord(fb);
		request.getRequestDispatcher("/servlet/linkrecordServlet").forward(request, response);
		
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
