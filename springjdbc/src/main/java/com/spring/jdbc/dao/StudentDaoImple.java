package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entites.Student;

public class StudentDaoImple implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;

	
	public int insert(Student student) {
		
		String quary = "insert into student(id,name,address) values(?,?,?);";
		int r = this.jdbcTemplate.update(quary,student.getId(),student.getName(),student.getAddress());
		
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	} 

	
	
}
