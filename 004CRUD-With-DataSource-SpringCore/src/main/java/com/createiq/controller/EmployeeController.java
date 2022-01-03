package com.createiq.controller;

import com.createiq.model.Employee;
import com.createiq.service.EmployeeService;

public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	public void add(Employee employee) {
		System.out.println("Employee Controller Add method : " + employee);
		employeeService.add(employee);
	}
	
	public void update(Employee employee) {
		employeeService.update(employee);
	}

}
