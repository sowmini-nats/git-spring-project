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
 * Servlet implementation class WithdrawServlet
 */
@WebServlet("/WithdrawServlet")
public class WithdrawServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WithdrawServlet() {
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
		HttpSession session=request.getSession();
		int id=Integer.parseInt(session.getAttribute("userid").toString());
		int amount = Integer.parseInt(request.getParameter("amount"));
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
			PrintWriter out = response.getWriter();
			int total=0;
			PreparedStatement s1 = con.prepareStatement("select * from savings where id=?");
			s1.setInt(1, id);
			ResultSet rs1 = s1.executeQuery();
			while(rs1.next()) {
				total=rs1.getInt("amount");
			}
			if(amount<=total) {
			total-=amount;
			
			PreparedStatement s = con.prepareStatement("update savings set amount=? where id=?");
			
			s.setInt(2, id);
			s.setInt(1, total);
			int value = s.executeUpdate();
			if(value==1) {
				response.setContentType("text/html");
				out.println("<h4>Amount withdrawal successfully</h4>");
				out.println("<a href='/BankAccount/Welcome.jsp'>Click here for Home page</a>");
			}
			else {
					response.setContentType("text/html");
					out.println("<h4>Server problem</h4>");
					out.println("<a href='/BankAccount/Welcome.jsp'>Click here for Home page</a>");
			}
			}
			else {
				response.setContentType("text/html");
				out.println("<h4>Insufficient balance</h4>");
				out.println("<a href='/BankAccount/Welcome.jsp'>Click here for Home page</a>");
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		doGet(request, response);
	}

}
