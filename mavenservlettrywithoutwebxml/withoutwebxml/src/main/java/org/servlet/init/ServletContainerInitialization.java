package org.servlet.init;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.servlet.classes.HelloServlet;

public class ServletContainerInitialization implements ServletContainerInitializer {

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		ctx.setInitParameter("x", "y");
		ctx.addServlet("hello", new HelloServlet());
		ctx.setInitParameter("hello", "howare");
	}
	
}
