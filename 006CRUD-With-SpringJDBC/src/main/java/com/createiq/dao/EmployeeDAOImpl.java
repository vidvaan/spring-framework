package com.createiq.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.createiq.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void add(Employee employee) {
		jdbcTemplate.update("INSERT INTO EMP01_TAB VALUES(?,?)",
				new Object[] { employee.getEid(), employee.getEname() });
	}

	public void update(Employee employee) {
		jdbcTemplate.update("UPDATE EMP01_TAB SET ENAME = ? WHERE EID = ?",
				new Object[] { employee.getEname(), employee.getEid() });

	}

	public void deleteById(Integer eid) {
		jdbcTemplate.update("DELET FROM EMP01_TAB WHERE EID = ?", new Object[] { eid });
	}

}
