package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginValidateServlet
 */
@WebServlet("/LoginValidateServlet")
public class LoginValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginValidateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		String password = request.getParameter("password");
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/account","root","Aneethaa1@");
			System.out.println("Database connected");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			PreparedStatement s = con.prepareStatement("select * from users where id=?");
			PrintWriter out = response.getWriter();
			s.setInt(1, id);
			ResultSet rs = s.executeQuery();
			int userid = 0;
			String pass = null;
//			if(rs!=null) {
			if(rs.next()) {
				userid=rs.getInt("id");
				pass=rs.getString("password");
				if(userid==id&&pass.equals(password)) {
					HttpSession session = request.getSession();
					session.setAttribute("userid", userid);
					response.sendRedirect("/BankAccount/Welcome.jsp");
				}
				else {
					response.setContentType("text/html");
					out.println("<h4>Invalid credentials</h4>");
					out.println("<a href='/BankAccount/Login.jsp'>Click here to re-login</a>");
				}
			}
//			}
			else {
				response.setContentType("text/html");
				out.println("<h4>Invalid credentials or not registered</h4>");
				out.println("<a href='/BankAccount/Welcome.jsp'>Click here to re-login/home page</a>");
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
