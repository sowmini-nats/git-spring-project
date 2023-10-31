package dataentry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class PartsDataEntry {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/supplier","root","Aneethaa1@");
			System.out.println("Connection established...");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		PreparedStatement stmt;
		try {
			System.out.println("Welcome");
			while(true) {
			System.out.println("Please select an option:\n1.Print all data\n2.Insert data\n3.Delete data\n4.Search data\n5.Update data\n6.Exit...");
			int choice = sc.nextInt();
			if(choice==6){
				System.out.println("Thank you...");
				break;
			}
			switch(choice) {
				case 1:{
					stmt=con.prepareStatement("select pid,pname,color from parts");
					ResultSet rs = stmt.executeQuery();
					while(rs.next()) {
						System.out.println("Id: "+rs.getInt("pid"));
						System.out.println("Name: "+rs.getString("pname"));
						System.out.println("Color: "+rs.getString("color"));
						System.out.println("------------");
					}
					break;
				}
				case 2:{
					System.out.println("Enter part id:");
					int id = sc.nextInt();
					System.out.println("Enter part name:");
					String name = sc.next();
					System.out.println("Enter part color:");
					String color = sc.next();
					stmt=con.prepareStatement("insert into parts (pid,pname,color) values (?,?,?)");
					stmt.setInt(1, id);
					stmt.setString(2, name);
					stmt.setString(3, color);
					int record = stmt.executeUpdate();
					System.out.println(""+record+" record added successfully");
					System.out.println("------------");
					break;
				}
				case 3:{
					System.out.println("Enter part id to delete:");
					int pid = sc.nextInt();
					stmt = con.prepareStatement("delete from parts where pid=?");
					stmt.setInt(1, pid);
					int record = stmt.executeUpdate();
					System.out.println(""+record+" record deleted successfully");
					System.out.println("------------");
					break;
				}
				case 4:{
					System.out.println("Enter part id to search:");
					int pid = sc.nextInt();
					stmt = con.prepareStatement("select pid,pname,color from parts where pid=?");
					stmt.setInt(1, pid);
					ResultSet rs = stmt.executeQuery();
//					if(rs!=null) {
					while(rs.next()) {
						System.out.println("Id: "+rs.getInt("pid"));
						System.out.println("Name: "+rs.getString("pname"));
						System.out.println("Color: "+rs.getString("color"));
						System.out.println("------------");
					}
//					}
//					else System.out.println("No data");
					break;
				}
				case 5:{
					System.out.println("Enter part id to update");
					int pid = sc.nextInt();
					System.out.println("Enter part name for updation");
					String pname = sc.next();
					stmt = con.prepareStatement("update parts set pname = ? where pid = ?");
					stmt.setString(1, pname);
					stmt.setInt(2, pid);
					stmt.executeUpdate();
					System.out.println("Record updated successfully");
					break;
				}
			}
			}}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
