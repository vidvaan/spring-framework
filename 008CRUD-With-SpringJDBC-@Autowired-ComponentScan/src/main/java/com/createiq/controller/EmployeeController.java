package com.createiq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.createiq.model.Employee;
import com.createiq.service.EmployeeService;

@Controller("empController")
public class EmployeeController {

	private EmployeeService employeeService;

	@Autowired
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
