package com.createiq.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.createiq.model.Employee;

@Repository

public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void add(Employee employee) {
		hibernateTemplate.save(employee);
	}

	public void update(Employee employee) {

		hibernateTemplate.update(employee);
	}

	public void deleteById(Integer eid) {
		Employee employee = new Employee();
		employee.setEid(eid);
		hibernateTemplate.delete(employee);
	}

}
