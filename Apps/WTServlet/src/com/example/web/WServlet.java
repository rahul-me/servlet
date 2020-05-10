package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6143646272720106165L;
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		String c = request.getParameter("color");
		out.println("Color selected: "+c);
	}

}
