package com.spring.orm;

import org.springframework.orm.hibernate5.HibernateTemplate;

//import jakarta.transaction.Transactional;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = false)
public class TeacherDaoImple implements TeacherDao{
	
	private HibernateTemplate template;

	@Override
	public int insert(Teacher teacher) {
		int r = (int)this.template.save(teacher);
		return r;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
}
