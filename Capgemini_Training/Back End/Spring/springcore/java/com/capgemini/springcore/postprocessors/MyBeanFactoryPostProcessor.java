package com.capgemini.springcore.postprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		System.out.println("Inside my Bean Factory Post Processor");
		
		BeanDefinition beanDefinition= beanFactory.getBeanDefinition("messageBean2");
		MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
		
		System.out.println("message from xml : " +propertyValues.getPropertyValue("message").getValue());
		propertyValues.addPropertyValue("message","Welcome to Spring!!!");
	}

	
}
