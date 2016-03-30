package com.crm.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharsetFilter implements Filter {
	String charsets = null;
	public static void main(String[] args) {
		

	}

	public void init(FilterConfig filterConfig) throws ServletException {
		charsets = filterConfig.getInitParameter("encoding");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		if(chain != null){
			request.setCharacterEncoding(charsets);
			response.setContentType("text/html;charset="+charsets);
		}
		chain.doFilter(request, response);
		
	}

	public void destroy() {
		
	}

}
