package com.createiq.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldMain {
	
	public static void main(String[] args) {
		
		//HelloWorldBean helloWorldBean = new HelloWorldBean();
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		HelloWorldBean helloWorldBean = (HelloWorldBean) applicationContext.getBean("helloWorldBean");
		helloWorldBean.sayHello();
		
		
		WelcomeBean welcomeBean = (WelcomeBean) applicationContext.getBean("welcomeBean");
		welcomeBean.sayWelcome();
		
		
		
	}

}
