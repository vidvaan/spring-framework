package com.createiq.datasource.demo;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConnectionWithSpring {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		DataSource dataSourceDBCP = (DataSource) applicationContext.getBean("dbcpDS");
		try {
			System.out.println("DBCP : "+dataSourceDBCP.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		DataSource dataSourceC3PO = (DataSource) applicationContext.getBean("c3poDS");
		System.out.println("C3PO : "+dataSourceC3PO);
		
		DataSource dataSourceSpring = (DataSource) applicationContext.getBean("springDS");
		System.out.println("Spring DS : "+dataSourceSpring);
		
		
		
		
		
	}

}
