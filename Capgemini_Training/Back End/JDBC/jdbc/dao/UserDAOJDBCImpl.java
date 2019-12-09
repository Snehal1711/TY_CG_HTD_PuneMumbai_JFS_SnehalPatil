package com.capgemini.jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.jdbc.beans.UserBean;

public class UserDAOJDBCImpl implements UserDAO{
	ArrayList<UserBean> list =new ArrayList<UserBean>();
	
	FileReader reader = null;
	Properties prop = null;
	//PreparedStatement pstmt =null;
	UserBean user;
	//ResultSet rs =null;
	public UserDAOJDBCImpl() {
		
		try {
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public UserBean getInfo(int userid) {
		try(Connection conn =DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
				PreparedStatement pstmt =conn.prepareStatement(prop.getProperty("query2")))
		{
			pstmt.setInt(1, userid);
			try(ResultSet rs =pstmt.executeQuery())
			{
				if(rs.next())
				{
				    user = new UserBean();
					user.setUserid(rs.getInt(1));
					user.setUsername(rs.getString(2));
					user.setEmail(rs.getString(3));
					user.setPassword(rs.getString(4));
					/*
					System.out.println("User Id : "+rs.getInt(1));
					System.out.println("User name : "+rs.getString(2));
					System.out.println("Email : "+rs.getString(3));
					System.out.println("------------------------------------");*/
				}
				return user;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		 catch (Exception e) {
			 e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public UserBean login(int userid, String password) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"), prop.getProperty("password"));
				PreparedStatement pstmt =conn.prepareStatement(prop.getProperty("query3"))) {
			
			pstmt.setInt(1, userid);
			pstmt.setString(2, password);
			
			try(ResultSet rs =pstmt.executeQuery()) {
				if(rs.next())
				{
				    user = new UserBean();
					user.setUserid(rs.getInt(1));
					user.setUsername(rs.getString(2));
					user.setEmail(rs.getString(3));
					user.setPassword(rs.getString(4));
					
				}
				return user;
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<UserBean> getALLInfo() {
 
		try(Connection conn =DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
				Statement stmt =conn.createStatement();ResultSet rs =stmt.executeQuery(prop.getProperty("query"))) {
			while(rs.next())
			{
				user =new UserBean();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setEmail(rs.getString(3));
				list.add(user);
			}
			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
