package com.capgemini.gmailapplication.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.gamilapplication.Factory.Gmail_UserFactory;
import com.capgemini.gmailapplication.DAO.Gmail_UserDAO;
import com.capgemini.gmailapplication.bean.Account_UserBean;
import com.capgemini.gmailapplication.bean.Inbox_Bean;

public class UserLogin {
	Scanner sc = new Scanner(System.in);
	Gmail_UserDAO dao = Gmail_UserFactory.getInstance();
	Account_UserBean user_account;
	String email;
	String password;

	public void login() {

		System.out.println("Enter your Email:");
		email = sc.next();

		System.out.println("Enter your Password");
		password = sc.next();
		user_account = dao.getLogin(email, password);
		if (user_account != null) {
			System.out.println("Your are logged In....");
			operation();
		} else {
			System.out.println("Please Try Again.. You may have entered wrong email or password...");
			login();
		}
	}//end of login

	public void operation() {
		System.out.println("\nPress A to compose\nPress B to show inbox");
		char option = sc.next().charAt(0);

		switch (option) {
		case 'A':
			System.out.println("Compose message:");
			System.out.println("Enter Email:");
			String email = sc.next();
		    user_account =dao.sender(email);
			if(user_account!=null) {
				dao.compose(user_account.getUserid());
			}else {
				System.out.println("Please Enter valid email id");
			}
			break;

		case 'B':
			System.out.println("Your inbox:");
			ArrayList<Inbox_Bean> inbox = dao.showInbox(user_account.getUserid());
			System.out.println("Meassage Id\tUserId\tMessage");
			for (Inbox_Bean i : inbox) {
				System.out.println(i.getMessage_id() + "\t\t" + i.getUser_id() + "\t" + i.getMessage());
			}
			break;

		default:
			System.out.println("Enter correct Option");

		}
     
	}//end of operation
	
}//end of class

