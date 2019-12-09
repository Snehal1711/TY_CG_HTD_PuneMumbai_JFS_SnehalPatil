	package com.capgemini.gmailapplication.DAO;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

import com.capgemini.gmailapplication.bean.Account_UserBean;
import com.capgemini.gmailapplication.bean.Inbox_Bean;

public class Gmail_Implementation implements Gmail_UserDAO {
	ArrayList<Inbox_Bean> list=new ArrayList<Inbox_Bean>();
	Scanner sc = new Scanner(System.in);
	FileReader reader = null;
	Properties prop = null;
	Account_UserBean user;
	Inbox_Bean inbox;
	public Gmail_Implementation () {
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
	public void register() {
        try( Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"), prop.getProperty("password"));
        		PreparedStatement pstmt =conn.prepareStatement(prop.getProperty("query"))) {
        	System.out.println("Enter User Name :");
        	pstmt.setString(1, sc.next() );
        	sc.next();
        	System.out.println("Enter Email ID :");
        	pstmt.setString(3, sc.next());
        	System.out.println("Create Password :");
        	pstmt.setString(2, sc.next());
        	int count =pstmt.executeUpdate();
        	if(count>0) {
        		System.out.println("Your Account is created.....");
        	}else {
        		System.out.println("Not able to Create an Account");
        	}
        	
        } catch (Exception e) {
			e.printStackTrace();
		}		
	}//end of register

	@Override
	public Account_UserBean getLogin(String email, String password) {
		try( Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"), prop.getProperty("password"));
        		PreparedStatement pstmt =conn.prepareStatement(prop.getProperty("query1"))) {
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			
			try(ResultSet rs = pstmt.executeQuery()) {
				while(rs.next()) {
					user = new Account_UserBean();
					user.setEmail(rs.getString(4));
					user.setPassword(rs.getString(3));
					user.setUserid(rs.getInt(1));
					user.setUserName(rs.getString(2));
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
	public void compose(int userid) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"), prop.getProperty("password"));
        		PreparedStatement pstmt =conn.prepareStatement(prop.getProperty("query2"))){
			pstmt.setInt(1, userid);
			System.out.println("Type your message here:");
			pstmt.setString(2, sc.next());
			//sc.nextLine();
			int count =pstmt.executeUpdate();
			if(count>0) {
				System.out.println("Your message is composed..");
			}else {
				System.out.println("Please try again..");
			}
			
			} catch (Exception e) {
				e.printStackTrace();
		}
	}//end of 

	@Override
	public ArrayList<Inbox_Bean> showInbox(int userid) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"), prop.getProperty("password"));
        		PreparedStatement pstmt =conn.prepareStatement(prop.getProperty("query3"))) {
			pstmt.setInt(1, userid);
			try(ResultSet rs = pstmt.executeQuery()) {
				while(rs.next()) {
					inbox = new Inbox_Bean();
					inbox.setMessage_id(rs.getInt(1));
					inbox.setUser_id(rs.getInt(2));
					inbox.setMessage(rs.getString(3));
					list.add(inbox);
				  	}
				return list;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Account_UserBean sender(String email) {
		try( Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"), prop.getProperty("password"));
        		PreparedStatement pstmt =conn.prepareStatement(prop.getProperty("query4"))) {
			pstmt.setString(1, email);
			try(ResultSet rs = pstmt.executeQuery()) {
				while(rs.next()) {
					user = new Account_UserBean();
					user.setEmail(rs.getString(4));
					user.setPassword(rs.getString(3));
					user.setUserid(rs.getInt(1));
					user.setUserName(rs.getString(2));
				}
				return user;
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}//end of class
