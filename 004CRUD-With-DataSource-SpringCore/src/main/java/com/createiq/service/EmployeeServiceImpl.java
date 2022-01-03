package com.createiq.service;

import com.createiq.dao.EmployeeDAO;
import com.createiq.dao.EmployeeDAOImpl;
import com.createiq.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public void add(Employee employee) {
		System.out.println("Employee Service Add method : " + employee);
		employeeDAO.add(employee);
	}

	public void update(Employee employee) {
		employeeDAO.update(employee);
	}
}
