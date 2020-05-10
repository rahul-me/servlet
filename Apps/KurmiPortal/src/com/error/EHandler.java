package com.error;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EHandler extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5252692887524502301L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse res){
		System.out.println("Invalid url post");
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse res){
		System.out.println("Invalid url get");
		System.out.println(request.getAttribute("javax.servlet.error.status_code"));
		System.out.println(request.getRequestURI());
		System.out.println(request.getRequestURL());
		System.out.println(request.getRequestedSessionId());
		System.out.println(request.getAuthType());
		System.out.println(request.getProtocol());
	}
}
