package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomeNewServlet
 */
@WebServlet("/HomeNewServlet")
public class HomeNewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeNewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String user=null;
		response.setContentType("text/html");
		out.println("<h2>Home Page</h2><br/>");
//		Cookie[] cookies=request.getCookies();
//		for(Cookie c: cookies) {
//			if(c.getName().equals("user"))
//				user=c.getValue();
//		}
//		out.println("currently logged in user " +user);
		HttpSession session=request.getSession();
		if(session==null) {
			response.sendRedirect("/SessionDemo/LoginPage.html");
		}
		else if(session.getAttribute("user")==null) {
				out.println("Not logged in <a href='/SessionDemo/LoginPage.html'> Login</a>");
				out.println("<p align='right'><a href='/SessionDemo/LogoutServlet'>Logout</a></p>");
		}
		else {
			user=session.getAttribute("user").toString();
			out.println("currently logged in as " +user);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
