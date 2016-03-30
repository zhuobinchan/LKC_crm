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
		if (admin.equals("client_admin")) {//�ͻ�����Ա��½
			if ((Factory.getClient_Admin_Impl().logincheck_client(id, password))==true) {
	              //˵����½�ɹ�����session�б���һ����½�ɹ��ı�ǣ���ʾ��½�ɹ�
				
				request.getSession().setAttribute("id",id);
				request.getSession().setMaxInactiveInterval(-1);
				request.getRequestDispatcher("/servlet/client_Admin_Servlet").forward(request, response);//�ͻ�����Ա��½�ɹ���ת
			}
			else if(id.equals("")||password.equals("")){
				request.setAttribute("message","�û���������Ϊ��"); 
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
			else {
				request.setAttribute("message","�û������������");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		}
		
		else if (admin.equals("system_admin")) {//ϵͳ����Ա��½
			if ((Factory.getSystem_Admin_Impl().logincheck_system(id, password))==true) {
				//˵����½�ɹ�����session�б���һ����½�ɹ��ı�ǣ���ʾ��½�ɹ�
				request.getSession().setAttribute("id",id);
				request.getSession().setMaxInactiveInterval(-1);
				request.getRequestDispatcher("/servlet/system_adminServlet").forward(request, response);//ϵͳ����Ա��½�ɹ���ת
			}
			else if(id.equals("")||password.equals("")){
				request.setAttribute("message","�û���������Ϊ��"); 
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
			else {
				request.setAttribute("message","�û������������");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		}
		
		else if(admin.equals("goods_admin")) {//��Ʒ����Ա��½
			if ((Factory.getGoods_Admin_Impl().logincheck_goods(id, password))==true) {
				//˵����½�ɹ�����session�б���һ����½�ɹ��ı�ǣ���ʾ��½�ɹ�
				request.getSession().setAttribute("id",id);
				request.getSession().setMaxInactiveInterval(-1);
				request.getRequestDispatcher("/servlet/goods_Admin_Servlet").forward(request, response);//��Ʒ����Ա��½�ɹ���ת
			}
			else if(id.equals("")||password.equals("")){
				request.setAttribute("message","�û���������Ϊ��"); 
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
			else {
				request.setAttribute("message","�û������������");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		}
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
