package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started" );
        ApplicationContext context =  new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        Student student = new Student();
        student.setStudentId(1);
        student.setStudentName("Rohit Bhowmik");
        student.setStudentCity("Panskura");
        int r = studentDao.insert(student);
        System.out.println("Done...." + r);
    }
}
