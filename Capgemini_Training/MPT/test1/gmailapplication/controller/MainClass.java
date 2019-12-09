package com.capgemini.gmailapplication.controller;

import java.util.Scanner;

import com.capgemini.gamilapplication.Factory.Gmail_UserFactory;
import com.capgemini.gmailapplication.DAO.Gmail_UserDAO;

public class MainClass {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		MainClass main = new MainClass();
		main.start();

	}// end of main

	public void start() {
		
		Gmail_UserDAO dao = Gmail_UserFactory.getInstance();
		System.out.println("Press 1 to login\nPress 2 to register ");
		System.out.println("Enter the option:");
		int option = sc.nextInt();

		switch (option) {

		case 1:
			UserLogin userlogin = new UserLogin();
			userlogin.login();
			break;

		case 2:
			dao.register();
			break;

		default:
			System.out.println("Choose Correct Option");

		}// end of switch
		System.out.println("Press Y to continue\nPress N to exit");
		char c = sc.next().charAt(0);
		if(c=='Y') {
			start();
		}else if(c=='N') {
			System.exit(0);
		}
	}//end of start

}// end of class
