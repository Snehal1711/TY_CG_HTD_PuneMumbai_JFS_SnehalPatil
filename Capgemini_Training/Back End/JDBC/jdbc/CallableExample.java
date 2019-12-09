package com.capgemini.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableExample {

	public static void main(String[] args) {
		Connection conn = null;
		Scanner Sc = new Scanner(System.in);
		CallableStatement cstmt = null;
		ResultSet rs = null;
		
		try {
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded....");
			System.out.println("-------------------");
			
			//connection to driver
			String dUurl = "jdbc:mysql://localhost:3306/capg_db";
			System.out.println("Enter the usename and password");
			String user = Sc.nextLine();
			String pw =Sc.nextLine();
			conn = DriverManager.getConnection(dUurl, user, pw);
			System.out.println("Connection..... ");
			System.out.println("----------------------");
			
			//issue query
			String query ="call getAllInfo";
			cstmt =conn.prepareCall(query);
			boolean b = cstmt.execute();
			if(b==true)
			{
				rs=cstmt.getResultSet();
				while(rs.next())
				{
					System.out.println("UserId : "+rs.getInt(1));
					System.out.println("User name : "+rs.getString(2));
					System.out.println("Email : "+rs.getString(3));
					System.out.println("Password : "+rs.getString(4));
					System.out.println("--------------------------------");
				}
			}
			else
			{ 
				int i = cstmt.getUpdateCount();
				if(i>0)
				{
					System.out.println("Operation successful.....");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(conn!=null)
			{
				try 
				{
					conn.close();
				} catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
			
			if(cstmt!=null)
			{
				try {
					cstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			Sc.close();
		}
		

	}

}
