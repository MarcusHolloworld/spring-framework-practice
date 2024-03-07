package com.spring.practice;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Employee employee) {
		String query = "insert into employee(id,name,city) values(?,?,?);";
		int r = this.jdbcTemplate.update(query,employee.getId(),employee.getName(),employee.getCity());
		return r;
	}
	
	@Override
	public int update(Employee employee) {
		String query = "update employee set name=? , city=? where id=?";
		int r = this.jdbcTemplate.update(query,employee.getName(),employee.getCity(),employee.getId());
		return r;
	}

	@Override
	public int delete(Employee employee) {
		String query = "delete from employee where id = ?";
		int r = this.jdbcTemplate.update(query,employee.getId());
		return 0;
	}
	
	@Override
	public Employee getEmployee(int employeeId) {
		String query = "select * from employee where id = ?";
		RowMapper<Employee> rowMapper = new RowmapperImpl();
		Employee employee = this.jdbcTemplate.queryForObject(query, rowMapper, employeeId);
		return employee;
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		String query = "select * from employee;";
		List<Employee> employees = this.jdbcTemplate.query(query, new RowmapperImpl());
		return employees;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
