package com.crm.web.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crm.dao.impl.Client_Admin_Impl;
import com.crm.factory.Factory;
import com.crm.utils.ServiceUtils;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public loginServlet() {
        super();
    }
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		String admin=request.getParameter("admin");
		if (admin.equals("client_admin")) {//客户管理员登陆
			if ((Factory.getClient_Admin_Impl().logincheck_client(id, password))==true) {
	              //说明登陆成功，在session中保存一个登陆成功的标记，表示登陆成功
				
				request.getSession().setAttribute("id",id);
				request.getSession().setMaxInactiveInterval(-1);
				request.getRequestDispatcher("/servlet/client_Admin_Servlet").forward(request, response);//客户管理员登陆成功跳转
			}
			else if(id.equals("")||password.equals("")){
				request.setAttribute("message","用户名或密码为空"); 
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
			else {
				request.setAttribute("message","用户名或密码错误");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		}
		
		else if (admin.equals("system_admin")) {//系统管理员登陆
			if ((Factory.getSystem_Admin_Impl().logincheck_system(id, password))==true) {
				//说明登陆成功，在session中保存一个登陆成功的标记，表示登陆成功
				request.getSession().setAttribute("id",id);
				request.getSession().setMaxInactiveInterval(-1);
				request.getRequestDispatcher("/servlet/system_adminServlet").forward(request, response);//系统管理员登陆成功跳转
			}
			else if(id.equals("")||password.equals("")){
				request.setAttribute("message","用户名或密码为空"); 
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
			else {
				request.setAttribute("message","用户名或密码错误");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		}
		
		else if(admin.equals("goods_admin")) {//商品管理员登陆
			if ((Factory.getGoods_Admin_Impl().logincheck_goods(id, password))==true) {
				//说明登陆成功，在session中保存一个登陆成功的标记，表示登陆成功
				request.getSession().setAttribute("id",id);
				request.getSession().setMaxInactiveInterval(-1);
				request.getRequestDispatcher("/servlet/goods_Admin_Servlet").forward(request, response);//商品管理员登陆成功跳转
			}
			else if(id.equals("")||password.equals("")){
				request.setAttribute("message","用户名或密码为空"); 
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
			else {
				request.setAttribute("message","用户名或密码错误");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		}
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
