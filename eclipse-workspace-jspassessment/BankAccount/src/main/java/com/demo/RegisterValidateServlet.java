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
 * Servlet implementation class RegisterValidateServlet
 */
@WebServlet("/RegisterValidateServlet")
public class RegisterValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterValidateServlet() {
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
		String name = request.getParameter("name");
		String acctype = request.getParameter("acctype");
		String branch = request.getParameter("branch");
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
			PreparedStatement s = con.prepareStatement("insert into users values(?,?,?,?,?)");
			PrintWriter out = response.getWriter();
			s.setInt(1, id);
			s.setString(2, password);
			s.setString(3, name);
			s.setString(4, acctype);
			s.setString(5, branch);
			int value = s.executeUpdate();
			if(value==1) {
				int amount = 0;
				PreparedStatement si = con.prepareStatement("insert into savings values(?,?)");
				si.setInt(1, id);
				si.setInt(2, amount);
				int value1 = si.executeUpdate();
				
				response.setContentType("text/html");
				out.println("<h4>User registered successfully</h4>");
				out.println("<a href='/BankAccount/Login.jsp'>Click here to login</a>");
				}
			else {
					response.setContentType("text/html");
					out.println("<h4>Validation error</h4>");
					out.println("<a href='/BankAccount/Welcome.jsp'>Click here for Home page/registration page</a>");
			}
			
		}
		catch(SQLException e) {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<h4>Same user id exists</h4>");
			out.println("<a href='/BankAccount/Welcome.jsp'>Click here for home page</a>");
		}
		doGet(request, response);
	}

}
