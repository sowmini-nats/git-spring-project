package jdbcdemo;

import java.sql.*;
import java.util.Scanner;



public class JDBCSelectStmt {

	public static void main(String[] ar) {

		// TODO Auto-generated method stub

		Connection con=null;
		Scanner sc = new Scanner(System.in);
		

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		try {

			 con=DriverManager.getConnection

					("jdbc:mysql://localhost:3306/hr","root","Aneethaa1@");

			System.out.println("Connection Established...");

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		Statement s;

		try {

			s = con.createStatement();
			System.out.println("Enter employee id:");
			String id = sc.next();

			ResultSet rs=s.executeQuery("select employee_id,first_name,hire_date from employees where employee_id="+id);

			while(rs.next()) {

				System.out.println("Employee Id "+rs.getInt("employee_id"));

				System.out.println("Name " +rs.getString(2));

				System.out.println("Date of Joining " + rs.getDate(3));

				System.out.println("-----------------");

			}

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

}