package com.createiq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.createiq.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void add(Employee employee) {
		System.out.println("Employee DAO Add method : " + employee);
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();
			connection.setAutoCommit(false);
			preparedStatement = connection.prepareStatement("INSERT INTO EMP01_TAB VALUES(?,?)");
			preparedStatement.setInt(1, employee.getEid());
			preparedStatement.setString(2, employee.getEname());
			preparedStatement.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	public void update(Employee employee) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();
			connection.setAutoCommit(false);
			preparedStatement = connection.prepareStatement("UPDATE EMP01_TAB SET ENAME = ? WHERE EID = ?");
			preparedStatement.setString(1, employee.getEname());
			preparedStatement.setInt(2, employee.getEid());
			preparedStatement.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	public void deleteById(Integer eid) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();
			connection.setAutoCommit(false);
			preparedStatement = connection.prepareStatement("DELETE FROM EMP01_TAB  WHERE EID = ?");
			preparedStatement.setInt(1, eid);
			preparedStatement.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}


	}

}
