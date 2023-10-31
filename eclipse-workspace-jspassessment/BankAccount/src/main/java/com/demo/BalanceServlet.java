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
 * Servlet implementation class BalanceServlet
 */
@WebServlet("/BalanceServlet")
public class BalanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BalanceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
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
			
			HttpSession session = request.getSession();
			if(session.getAttribute("userid")!=null) {
				int uid = Integer.parseInt(session.getAttribute("userid").toString());
				PreparedStatement s = con.prepareStatement("select * from savings where id=?");
				PrintWriter out = response.getWriter();
				s.setInt(1, uid);
				ResultSet rs = s.executeQuery();
				int amount = 0;
				String pass = null;
				while(rs.next()) {
					amount=rs.getInt("amount");
					response.setContentType("text/html");
					out.println("<h4>Your account balance is: "+amount);
					out.println("<a href='/BankAccount/Welcome.jsp'><h3>Click here for home page</h3></a>");
				}
			}
			else {
				response.sendRedirect("/BankAccount/Welcome.jsp");
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
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
