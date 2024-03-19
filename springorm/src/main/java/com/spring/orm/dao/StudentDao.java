package com.spring.orm.dao;
import org.springframework.orm.hibernate5.HibernateTemplate;


import com.spring.orm.entities.Student;

import jakarta.transaction.Transactional;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	//Save student
	@Transactional
	public int insert(Student student) {
		Integer r = (Integer)this.hibernateTemplate.save(student);
		return r;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
