package com.springcore.ci;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person person1 = (Person) context.getBean("person1");
		System.out.println(person1);
		
		
		Adition add = (Adition)context.getBean("add");
		add.doSum();
	}

}
