package com.crm.web.UI;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class add_Admin_UIServlet extends HttpServlet {



	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("message").equals("addCA")) {
			request.setAttribute("message", "addCA");
			request.getRequestDispatcher("/WEB-INF/addAdmin.jsp").forward(request, response);
		}
		if (request.getParameter("message").equals("addGA")) {
			request.setAttribute("message", "addGA");
			request.getRequestDispatcher("/WEB-INF/addAdmin.jsp").forward(request, response);
		}

	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}


}
