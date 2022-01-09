package com.createiq.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.createiq.config.SpringConfig;
import com.createiq.controller.EmployeeController;
import com.createiq.model.Employee;

public class EmployeeFindAllClient {
	
	public static void main(String[] args) {
		// ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
	    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		EmployeeController employeeController = applicationContext.getBean("empController", EmployeeController.class);
		List<Employee> employees = employeeController.findByName("Test");
		employees.forEach(System.out::println);

	}

}
