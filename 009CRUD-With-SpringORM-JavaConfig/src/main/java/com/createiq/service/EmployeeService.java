package com.createiq.service;

import java.util.List;

import com.createiq.model.Employee;

public interface EmployeeService {
	 void add(Employee employee);

	 void update(Employee employee);

	void deleteById(Integer eid);
	
	List<Employee> findAll();
	
    List<Employee> findByName(String name);
}
