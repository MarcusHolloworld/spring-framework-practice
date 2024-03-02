package com.sprintcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sprintcore/collections/collectionconfig.xml");
		Emp employee1 = (Emp) context.getBean("emp1");
		System.out.println(employee1);
		System.out.println(employee1.getName());
		System.out.println(employee1.getAddress());
		System.out.println(employee1.getPhones());
		System.out.println(employee1.getCourses());
		System.out.println(employee1.getPhones().getClass().getName());
	}

}
