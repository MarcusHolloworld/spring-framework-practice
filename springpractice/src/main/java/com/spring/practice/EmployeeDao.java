package com.spring.practice;

import java.util.List;

public interface EmployeeDao {
	
	public int insert(Employee employee);
	
	public int update(Employee employee);
	
	public int delete(Employee employee);
	
	public Employee getEmployee(int employeeId);
	
	public List<Employee> getAllEmployee();
}
