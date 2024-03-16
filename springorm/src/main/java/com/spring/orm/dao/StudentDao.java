package com.spring.orm.dao;
import org.springframework.orm.hibernate5.HibernateTemplate;


import com.spring.orm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	//Save student
	public int insert(Student student) {
		Integer r = (Integer)this.hibernateTemplate.save(student);
		return r;
	}
}
