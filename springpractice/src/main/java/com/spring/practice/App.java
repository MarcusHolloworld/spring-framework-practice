package com.spring.practice;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Stsrted....." );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/practice/config.xml");
        EmployeeDao employeeDao = context.getBean("employeeDao",EmployeeDaoImpl.class);
        //Employee employee = new Employee();
        //employee.setId(114);
        //employee.setName("Priyanka Das");
        //employee.setCity("Kharagpur");
        //int result = employeeDao.delete(employee);
        //Employee employee = employeeDao.getEmployee(111);
        //System.out.println(employee);
        List<Employee> employees = employeeDao.getAllEmployee();    
        for (Employee employee : employees ) {
        	System.out.println(employee);
        }
    }
}
