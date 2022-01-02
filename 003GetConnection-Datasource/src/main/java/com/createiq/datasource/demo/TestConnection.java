package com.createiq.datasource.demo;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestConnection {

	public static void main(String[] args) {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/jdbcdemo");
		basicDataSource.setUsername("root");
		basicDataSource.setPassword("root");
		System.out.println("---------------DBCP----------------------------");
		try {
			System.out.println(basicDataSource.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			ComboPooledDataSource cpds = new ComboPooledDataSource();
			cpds.setDriverClass("com.mysql.jdbc.Driver");
			cpds.setJdbcUrl("jdbc:mysql://localhost:3306/jdbcdemo");
			cpds.setUser("root");
			cpds.setPassword("root");
			try {
				System.out.println("---------------C3PO----------------------------");
				System.out.println(cpds.getConnection());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/jdbcdemo");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		try {
			System.out.println("---------------Spring Datasource----------------------------");
			System.out.println(dataSource.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
