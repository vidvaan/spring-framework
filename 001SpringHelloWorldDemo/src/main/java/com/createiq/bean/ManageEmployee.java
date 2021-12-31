package com.createiq.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ManageEmployee {
	
	
	public static void main(String[] args) {
		
//		Employee employee = new Employee(1, "Balaji", 23000.00);
		
		
//		Employee e1 = new Employee();
//		e1.setEid(2);
//		e1.setEname("Balaji");
//		e1.setEsal(30000.00);
		
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee = applicationContext.getBean("employee", Employee.class);
		System.out.println(employee);
		
	}

}
