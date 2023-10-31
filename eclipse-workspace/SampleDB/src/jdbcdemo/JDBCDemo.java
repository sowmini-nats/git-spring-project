package jdbcdemo;

import java.sql.*;

public class JDBCDemo {

	public static void main(String[] ar) {
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

		Statement s;
		try {
			s = con.createStatement();
			int res=s.executeUpdate("insert into parts(pid,pname,color) values(16,'Mouse','Black')");
			System.out.println(res + " record(s) inserted..");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}