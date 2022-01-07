package com.createiq.client;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.createiq.config.SpringConfig;
import com.createiq.controller.EmployeeController;
import com.createiq.model.Employee;

public class EmployeeAddClient {

	public static void main(String[] args) {
		// ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
	    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		EmployeeController employeeController = applicationContext.getBean("empController", EmployeeController.class);
		Employee employee = new Employee(12, "Test");
		employeeController.add(employee);
	}

}
