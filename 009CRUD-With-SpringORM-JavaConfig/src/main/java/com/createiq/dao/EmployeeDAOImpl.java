package com.createiq.dao;

import java.util.List;

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

	public List<Employee> findAll() {
		return (List<Employee>) hibernateTemplate.find("from Employee");
	}
	
	//Select * from EMp where eid = ? and ename = ?
	public List<Employee> findByNameAndId(String name,Integer id){
		Employee employee = new Employee();
		employee.setEname(name);
		employee.setEid(id);
		return hibernateTemplate.findByExample(employee);
	}
	
	public List<Employee> findByName(String name){
		Employee employee = new Employee();
		employee.setEname(name);
		return hibernateTemplate.findByExample(employee);
	}

}
