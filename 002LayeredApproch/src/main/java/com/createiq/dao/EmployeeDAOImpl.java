package com.createiq.dao;

import com.createiq.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	

	public void add(Employee employee) {
		System.out.println("Employee DAO Add method : "+employee);
	}

}
