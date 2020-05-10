package maven.servlet.serveresource;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serveres")
public class ServeResourceServlet extends HttpServlet{
	/**
	 * Servlet to check how resource has been served by servlet
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//request.getRequestDispatcher("page/start.jsp").forward(request, response);
		request.getRequestDispatcher("include").forward(request, response);
	}
}
