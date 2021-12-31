package com.createiq.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloWorldMain {
	
	public static void main(String[] args) {
		
		//HelloWorldBean helloWorldBean = new HelloWorldBean();
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");''
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
				
		HelloWorldBean helloWorldBean = (HelloWorldBean) beanFactory.getBean("helloWorldBean");
		helloWorldBean.sayHello();
		
		
		WelcomeBean welcomeBean = (WelcomeBean) beanFactory.getBean("welcomeBean");
		welcomeBean.sayWelcome();
		
		
		
	}

}
