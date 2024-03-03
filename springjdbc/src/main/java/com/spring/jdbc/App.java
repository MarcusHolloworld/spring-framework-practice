package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My programe is started..........." );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert query
        String quary = "insert into student(id,name,address) values(?,?,?);";
        
        //fire query
        int result = template.update(quary,444,"Tridip Pramanik","Hour");
        System.out.println("Number of record insedrted.." + result);
    }
}