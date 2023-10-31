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
 * Servlet implementation class FundTransferServlet
 */
@WebServlet("/FundTransferServlet")
public class FundTransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FundTransferServlet() {
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
		int fundamount = Integer.parseInt(request.getParameter("amount"));
		int fundid = Integer.parseInt(request.getParameter("fundid"));
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
			int fundidamt=0,useramt=0;
			PrintWriter out = response.getWriter();
			int total=0;
			PreparedStatement s1 = con.prepareStatement("select * from users where id=?");
			s1.setInt(1, fundid);
			ResultSet rs1 = s1.executeQuery();
//			if(rs1!=null) {
				if(rs1.next()) {
						PreparedStatement s2 = con.prepareStatement("select * from savings where id=?");
						s2.setInt(1, fundid);
						ResultSet rs2 = s2.executeQuery();
						while(rs2.next()) {
							fundidamt = rs2.getInt("amount");
						}
						PreparedStatement s3 = con.prepareStatement("select * from savings where id=?");
						s3.setInt(1, id);
						ResultSet rs3 = s3.executeQuery();
						while(rs3.next()) {
							useramt = rs3.getInt("amount");
						}
						if(fundamount<=useramt) {
							useramt-=fundamount;
							fundidamt+=fundamount;
						PreparedStatement s = con.prepareStatement("update savings set amount=? where id=?");
						s.setInt(2, id);
						s.setInt(1, useramt);
						int value = s.executeUpdate();
						PreparedStatement s4 = con.prepareStatement("update savings set amount=? where id=?");
						s4.setInt(2, fundid);
						s4.setInt(1, fundidamt);
						int value2 = s4.executeUpdate();
						if(value2==1) {
							response.setContentType("text/html");
							out.println("<h4>Amount transferred successfully</h4>");
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
//			}

			else {
				response.setContentType("text/html");
				out.println("<h4>User doesn't exist. Transaction cancelled</h4>");
				out.println("<a href='/BankAccount/Welcome.jsp'>Click here for Home page</a>");
			}
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		doGet(request, response);
	}

}
