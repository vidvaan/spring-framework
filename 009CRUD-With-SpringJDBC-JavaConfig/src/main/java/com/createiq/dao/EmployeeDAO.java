package com.createiq.dao;

import com.createiq.model.Employee;

public interface EmployeeDAO {
	
	 void add(Employee employee);

	 void update(Employee employee);
	 
	 void deleteById(Integer eid);

}
