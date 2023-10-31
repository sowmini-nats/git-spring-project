package com.demo;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductQuery {
	public List<Product> getProducts(){
	List<Product> prodList=new ArrayList<Product>(); 
	Connection con=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		 con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/productschema","root","Aneethaa1@");
		System.out.println("Connection Established...");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	try{
		PreparedStatement s=con.prepareStatement("select * from product");
		ResultSet rs= s.executeQuery();
		while(rs.next()) {
			Product prd = new Product();
			prd.setPrdId(rs.getInt("prdId"));
			prd.setPrdName(rs.getString("prdName"));
			prd.setPrdPrice(rs.getFloat("prdPrice"));
			prodList.add(prd);
		}
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	return prodList;
	}
	
	public int insertProduct(Product p) {
		
		Connection con=null;
		int value=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/productschema","root","Aneethaa1@");
			System.out.println("Connection Established...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			PreparedStatement s=con.prepareStatement("insert into product values (?,?,?)");
			s.setInt(1,p.getPrdId());
			s.setString(2,p.getPrdName());
			s.setFloat(3,p.getPrdPrice());
			value = s.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return value;
	}
}
