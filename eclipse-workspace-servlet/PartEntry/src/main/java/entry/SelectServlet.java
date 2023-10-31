package entry;

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

/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectServlet() {
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
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			 con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/supplier","root","Aneethaa1@");
			System.out.println("Connection Established...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try{
			PreparedStatement s=con.prepareStatement("select * from parts");
			ResultSet rs= s.executeQuery();
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<center><h4>List of parts</h4>");
			out.println("<table><thead><th>Pid</th><th>Pname</th><th>Color</th><th>Action</th></thead><tbody>");
			while (rs.next()) {
		        int pid = rs.getInt("pid");
		        String pname = rs.getString("pname");
		        String color = rs.getString("color");
		        out.println("<tr>");
				out.println("<td>"+pid+"</td>");
				out.println("<td>"+pname+"</td>");
				out.println("<td>"+color+"</td>");
				out.println("<td><button><a href='/PartEntry/DeleteServlet?pid="+pid+"'>Delete</button></td>");
				out.println("</tr>");
		    }
			out.println("</tbody></table><br/><br/>");
			out.println("<h4>Select an option</h4>");
			out.println("<h4><a href='/PartEntry/InsertPart.html'>Insert data</a></h4>"
					+ "<h4><a href='/PartEntry/UpdatePart.html'>Update data</a></h4></center>");		
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
