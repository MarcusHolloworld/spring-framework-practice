package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
		TeacherDao teacherDao = context.getBean("teacherDao",TeacherDaoImple.class);
		Teacher teacher = new Teacher();
		teacher.setName("Dishani Patra");
		teacher.setAddress("Uluberia");
		teacher.setPhone_no(7867458245l);
		
		int r = teacherDao.insert(teacher);
		System.out.println(r + " record inserted");
	}

}
