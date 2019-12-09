package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MobileBean;

public class MobileTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("mobileConfig.xml");
		MobileBean mobileBean = context.getBean("mobile",MobileBean.class);
		
		System.out.println("Brand        : " + mobileBean.getBrandName());
		System.out.println("Model Name   : " + mobileBean.getModelName());
		System.out.println("Price        : Rs." +mobileBean.getPrice());
		System.out.println("Display Size : " + mobileBean.getDisplayBean().getDisplaySize());
		System.out.println("Resolution   : " + mobileBean.getDisplayBean().getResolution());
	}

	
}
