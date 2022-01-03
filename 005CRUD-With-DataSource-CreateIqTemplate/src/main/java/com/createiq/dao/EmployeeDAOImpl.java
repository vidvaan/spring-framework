package com.createiq.dao;

import com.createiq.model.Employee;
import com.createiq.template.CreateIqTemplate;

public class EmployeeDAOImpl implements EmployeeDAO {

	private CreateIqTemplate createIqTemplate;

	public void setCreateIqTemplate(CreateIqTemplate createIqTemplate) {
		this.createIqTemplate = createIqTemplate;
	}

	public void add(Employee employee) {
		createIqTemplate.excuteUpdate("INSERT INTO EMP01_TAB VALUES(?,?)",
				new Object[] { employee.getEid(), employee.getEname() });
	}

	public void update(Employee employee) {

		createIqTemplate.excuteUpdate("UPDATE EMP01_TAB SET ENAME = ? WHERE EID = ?",
				new Object[] { employee.getEname(), employee.getEid() });

	}

	public void deleteById(Integer eid) {

		createIqTemplate.excuteUpdate("DELET FROM EMP01_TAB WHERE EID = ?", new Object[] { eid });
	}

}
