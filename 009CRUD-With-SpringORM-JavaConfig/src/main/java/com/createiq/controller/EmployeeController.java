package com.createiq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.createiq.model.Employee;
import com.createiq.service.EmployeeService;

@Controller("empController")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	public void add(Employee employee) {
		employeeService.add(employee);
	}

	public void deleteById(Integer eid) {
		employeeService.deleteById(eid);
	}

	public List<Employee> findAll() {
		return employeeService.findAll();
	}
	
	public List<Employee> findByName(String name){
		return employeeService.findByName(name);
	}

}
