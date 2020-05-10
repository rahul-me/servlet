package maven.servlet.cfgannotation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check")
public class CheckResponse extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		//lets give this page to user upon get request to this servlet
		//we'll try two options. One using response object's sendRedirect method
		//and other using RequestDispatcher
		
		//Option 1: Using HttpServletResponse
		
		//response.sendRedirect("WEB-INF/pages/start.jsp"); // this option did not work
		
		//Option 2: Using RequestDispatcher
		
		request.getRequestDispatcher("WEB-INF/pages/start.jsp").include(request, response);
		// So conclusion is servlet can access WEB-INF folder.
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response){
		
	}
	
}
