 package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Scanner;

public class JDBCInsertion {

	public static void main(String[] args) {
		Connection conn = null;
		//Statement stmt =null;
		Scanner Sc =new Scanner(System.in);
		PreparedStatement pstmt =null;
		try 
		{ //load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded.....");
			System.out.println("----------------------");
			
			//Get the connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=root";
			conn = DriverManager.getConnection(dbUrl); // it is an static method
			System.out.println("Connection Establish......");
			System.out.println("--------------------------");
			
			//Issue the SQL query
			//String query =  "INSERT INTO users_info values(2019001 , 'Sneha Jadhav' ,'snehaj@gmail.com' ,'jadhavsneha')";
			String query =  "INSERT INTO users_info values(? ,?, ? ,?)";
			pstmt =conn.prepareStatement(query);
			System.out.println("Enter User Id : ");
			pstmt.setInt(1, Integer.parseInt(Sc.nextLine()));
			System.out.println("Enter UserName : ");
			pstmt.setString(2, Sc.nextLine());
			System.out.println("Enter the Email : ");
			pstmt.setString(3, Sc.nextLine());
			System.out.println("Enter the password : ");
			pstmt.setString(4, Sc.nextLine());
			
			//stmt = conn.createStatement();
			int i = pstmt.executeUpdate();
			
			//Process the result
			if(i>0)
			{
				System.out.println("data inserted......");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			if(conn!=null)
			{
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			Sc.close();
		}

	}

}
