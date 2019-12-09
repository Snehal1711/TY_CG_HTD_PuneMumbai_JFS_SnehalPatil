package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MessageBean;

public class MessageTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//((AbstractApplicationContext)context).registerShutdownHook(); // to destroy the object we have to close the container and this statement
		                                                                //can be anywhere
		MessageBean messageBean = (MessageBean) context.getBean("messageBean");
		
		System.out.println(messageBean.getMessage());
		((AbstractApplicationContext)context).close(); //this statement should be in last
	}//end of main

}//
