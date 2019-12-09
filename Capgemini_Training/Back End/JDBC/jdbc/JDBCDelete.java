package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDelete {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt =null;
		Scanner Sc =new Scanner(System.in);
		
		try {
			//load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded...");
			System.out.println("-------------------");
			
			//Get the connection
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=root";
			conn = DriverManager.getConnection(dbUrl); // it is an static method
			System.out.println("Connection Establish......");
			System.out.println("--------------------------");
			
			//Issue a query
			String query ="Delete from users_info where userid =?";
			pstmt =conn.prepareStatement(query);
			System.out.println("Enter User Id : ");
			pstmt.setInt(1, Integer.parseInt(Sc.nextLine()));
			
			int i = pstmt.executeUpdate();
			
			//Process the result
			if(i>0)
			{
				System.out.println("data deleted......");
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
