package com.spring.jdbc;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImple;
import com.spring.jdbc.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My programe is started..........." );
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        List<Student> students = studentDao.getAllStudents();
        for (Student s : students) {
        	System.out.println(s);
        }
        //Scanner scanner = new Scanner(System.in);
      //  Student student = new Student();
      //  student.setId(456);
      //  student.setName("Sk Sahajahan");
      //  student.setAddress("Sondeshkhali");
      //  int result = studentDao.update(student);
        
        //Student student = new Student();
        //student.setId(456);
        //int result = studentDao.delete(student);
          
        
        //System.out.println("Number of record deleted.." + result);
		/*
		 * System.out.println("Choose a option according to your choice!..");
		 * System.out.println("-------------------------------------------");
		 * System.out.println("1.Insert"); System.out.println("2.Update");
		 * System.out.println("3.Delete"); System.out.println();
		 * System.out.print("Enter your choice: "); int choice = scanner.nextInt();
		 * 
		 * if (choice == 1) { System.out.print("Enter student id: "); int id =
		 * scanner.nextInt(); scanner.nextLine();
		 * System.out.print("Enter student named: "); String name = scanner.nextLine();
		 * System.out.print("Enter student address: "); String address =
		 * scanner.nextLine(); Student student = new Student(); student.setId(id);
		 * student.setName(name); student.setAddress(address); int result =
		 * studentDao.insert(student); System.out.println(result +
		 * " Record Inserted....");
		 * 
		 * } else if (choice == 2) {
		 * System.out.print("Enter student id for update record: "); int id =
		 * scanner.nextInt(); scanner.nextLine();
		 * System.out.print("Enter updated student named: "); String name =
		 * scanner.nextLine(); System.out.print("Enter updated student address: ");
		 * String address = scanner.nextLine(); Student student = new Student();
		 * student.setId(id); student.setName(name); student.setAddress(address); int
		 * result = studentDao.update(student); System.out.println(result +
		 * " Record Updated...."); } else if (choice == 3) {
		 * System.out.print("Enter student id for delete record: "); int id =
		 * scanner.nextInt(); Student student = new Student(); student.setId(id); int
		 * result = studentDao.delete(student); System.out.println(result +
		 * " Record Deleted...."); } else { System.out.println("Invalid choice"); }
		 */
    }
}