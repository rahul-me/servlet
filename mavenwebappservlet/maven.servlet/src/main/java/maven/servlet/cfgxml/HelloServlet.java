package maven.servlet.cfgxml;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/plain");
		System.out.println("My First Servlet");
		PrintWriter writer = response.getWriter();
		writer.print("<html><body><h1>My first servlet</h1></body></html>");
		writer.close();
	}
	
}
