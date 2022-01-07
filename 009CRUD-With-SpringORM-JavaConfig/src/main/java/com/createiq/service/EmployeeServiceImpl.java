package com.createiq.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.dao.EmployeeDAO;
import com.createiq.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;

	public void add(Employee employee) {
		System.out.println("Employee Service Add method : " + employee);
		employeeDAO.add(employee);
	}

	public void update(Employee employee) {
		employeeDAO.update(employee);
	}

	public void deleteById(Integer eid) {
		employeeDAO.deleteById(eid);
	}
}
