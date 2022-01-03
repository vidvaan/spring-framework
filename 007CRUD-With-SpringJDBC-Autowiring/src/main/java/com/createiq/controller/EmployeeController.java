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
		employeeService.add(employee);
	}
	
	public void deleteById(Integer eid) {
		employeeService.deleteById(eid);
	}

}
