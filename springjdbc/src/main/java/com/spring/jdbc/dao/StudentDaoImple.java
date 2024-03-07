package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;

public class StudentDaoImple implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		
		String quary = "insert into student(id,name,address) values(?,?,?);";
		int r = this.jdbcTemplate.update(quary,student.getId(),student.getName(),student.getAddress());
		
		return r;
	}
	
	@Override
	public int update(Student student) {
		 String quary = "update student set name=? , address=? where id=?";
		 int r = this.jdbcTemplate.update(quary,student.getName(),student.getAddress(),student.getId());
		return r;
	}
	
	@Override
	public int delete(Student student) {
		String quary = "delete from student where id=?";
		int r = this.jdbcTemplate.update(quary,student.getId());
		return r;
	}
	
	@Override
	public Student getStudent(int studentId) {
		//selecting single student data
		String query = "select * from student where id = ?";
		RowMapper<Student> rowMapper = new RowMapperImple(); 
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}
	
	@Override
	public List<Student> getAllStudents() {
		// selecting Multiple student
		String query = "select * from student;";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImple());
		return students;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
