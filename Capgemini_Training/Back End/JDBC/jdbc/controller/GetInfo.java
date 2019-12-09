package com.capgemini.jdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.jdbc.beans.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;

public class GetInfo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		UserDAO dao = UserFactory.getInstance();
		List<UserBean> user =dao.getALLInfo();
		//System.out.println("Enter the user id and password");
		//UserBean user = dao.getInfo(sc.nextInt());
		//UserBean user = dao.login(sc.nextInt(),sc.next());
		if(user!=null)
		{
	      System.out.println(user);
		}
	      else {
			System.out.println("Something went wrong");
		}
		sc.close();
	}

}
