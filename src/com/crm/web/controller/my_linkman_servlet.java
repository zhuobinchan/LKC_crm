package com.crm.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.List;

import javax.security.auth.message.ServerAuth;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.crm.domain.Client_Basic;
import com.crm.domain.My_Linkman;
import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class my_linkman_servlet extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String message=request.getParameter("message");
		int client_id=-1;
		
		if(request.getParameter("id")!=null)
			client_id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		
		if(message!=null && message.equals("search") && name!=null && !name.equals("")){

			System.out.println(name);
			BussinessService_Impl service=new BussinessService_Impl();
			List<My_Linkman> client=service.findAllMy_Linkman(name);
			request.setAttribute("client", client);
			request.getRequestDispatcher("/WEB-INF/my_linkman.jsp").forward(request, response);		
		}

		if(message!=null && message.equals("detail")){//显示我方联系人详细信息
			BussinessService service=new BussinessService_Impl();
			My_Linkman myLiknman=service.findMy_Linkman(client_id);
			request.setAttribute("myLiknman", myLiknman);
			request.getRequestDispatcher("/WEB-INF/my_linkman_detail.jsp").forward(request, response);			
		}else if(message!=null && message.equals("delete")){//删除我方联系人
			BussinessService service=new BussinessService_Impl();
			service.deleteMy_Linkman(client_id);
			request.getRequestDispatcher("/servlet/my_linkman_servlet?message=null").forward(request, response);
		}else if(message!=null && message.equals("updata")){

			My_Linkman my_Linkman=null;
			my_Linkman=new My_Linkman();
			Enumeration<String> paraNames=request.getParameterNames();	
			for(Enumeration e=paraNames;e.hasMoreElements();){
		
			    try { 
			       String thisName=e.nextElement().toString();
			       String thisValue=request.getParameter(thisName);
					       if (  !thisName.equals("myLMid")) {
								BeanUtils.setProperty(my_Linkman, thisName, thisValue);
						}else{
							int aa=Integer.parseInt(thisValue);
							BeanUtils.setProperty(my_Linkman, thisName, aa);
						}
			       
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (InvocationTargetException e1) {
					e1.printStackTrace();
				}//把request中对应属性的名称的值反射到与bean中相应的属性中（类似jsp：setProperty中的*通配符）
			 
			}
			
			BussinessService service=new BussinessService_Impl();
			service.updataMy_Linkman(my_Linkman);
			request.getRequestDispatcher("/servlet/my_linkman_servlet?message=null").forward(request, response);
			
		}else if(message!=null && message.equals("new")){
			
			My_Linkman my_Linkman=null;
			my_Linkman=new My_Linkman();
			Enumeration<String> paraNames=request.getParameterNames();	
			for(Enumeration e=paraNames;e.hasMoreElements();){
		
			    try { 
			       String thisName=e.nextElement().toString();
			       String thisValue=request.getParameter(thisName);
					       if (!thisName.equals("myLMid")) {
								BeanUtils.setProperty(my_Linkman, thisName, thisValue);
						}else{
							int aa=Integer.parseInt(thisValue);
							BeanUtils.setProperty(my_Linkman, thisName, aa);
						}
			       
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (InvocationTargetException e1) {
					e1.printStackTrace();
				}//把request中对应属性的名称的值反射到与bean中相应的属性中（类似jsp：setProperty中的*通配符）
			 
			}

			BussinessService service=new BussinessService_Impl();
			service.addMy_Linkman(my_Linkman);
			
			request.getRequestDispatcher("/servlet/my_linkman_servlet?message=null").forward(request, response);	
		}		
		else			
		{
		
		//查找所有联系人 
		BussinessService_Impl service=new BussinessService_Impl();
		List<My_Linkman> client=service.findAllMy_Linkman();
		request.setAttribute("client", client);	
		request.getRequestDispatcher("/WEB-INF/my_linkman.jsp").forward(request, response);
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
