package maven.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login", initParams= {
		@WebInitParam(name="dburl", value="jdbc:mysql://localhost:3306/heco_db"),
		@WebInitParam(name="dbuname", value="root"),
		@WebInitParam(name="dbpass", value="ric#101991")
})
public class LoginServlet extends HttpServlet {
	/**
	 * Servlet to check login credentials
	 */
	private static final long serialVersionUID = 1L;
	
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher("WEB-INF/pages/login.jsp").forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String name = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		PrintWriter writer = response.getWriter();
		
		if("rahul@grid-scape.com".equals(name) && "rahul".equals(pass)){		
			writer.print("Welcome");
		} else {
			writer.print("Sorry credentials are incorrect");
		}
		
		ServletConfig config = getServletConfig();
		Enumeration<String> enumeration = config.getInitParameterNames();		
		while(enumeration.hasMoreElements()){
			String param = enumeration.nextElement();
			System.out.println(param+" : "+config.getInitParameter(param));
		}
		
		ServletContext servletContext = getServletContext();				
		Enumeration<String> contextParams = servletContext.getInitParameterNames();
		while(contextParams.hasMoreElements()){
			String contextParam = contextParams.nextElement();
			System.out.println("Context Parameter: "+contextParam+" : "+servletContext.getInitParameter(contextParam));
		}
		
		Map<String, String> map = new HashMap<String, String>();
		
		writer.close();
	}
}
