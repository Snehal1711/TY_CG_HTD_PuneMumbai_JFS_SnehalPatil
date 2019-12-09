package com.capgemini.springcore.anotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.capgemini.springcore.anotations.beans.MessageBean;

@Configuration
public class MessageConfig {

	@Bean
	@Scope("prototype")
	public MessageBean getMessageBean() {
		MessageBean messageBean = new MessageBean();
		messageBean.setMessage("Welcome to Mumbai...");
		return messageBean;
	}
}//end of class
