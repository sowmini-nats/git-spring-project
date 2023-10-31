package entry;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int pid = Integer.parseInt(request.getParameter("pid"));
		String pname = request.getParameter("pname");
		String color = request.getParameter("color");
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/supplier","root","Aneethaa1@");
			System.out.println("Connection Established...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			PreparedStatement s=con.prepareStatement("Update parts set pname=?,color=? where pid=?");
			s.setInt(3, pid);
			s.setString(1, pname);
			s.setString(2, color);
			int value = s.executeUpdate();
			if(value!=0) {
				PrintWriter out = response.getWriter();
				out.println("1 record updated successfully");
				response.setContentType("text/html");
				out.println("<h4>Select an option</h4>");
				out.println("<h4><a href='/PartEntry/InsertPart.html'>Insert data</a></h4>"
						+ "<h4><a href='/PartEntry/UpdatePart.html'>Update data</a></h4>"
						+ "<h4><a href='/PartEntry/SelectServlet'>Display data</a></h4></center>");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
