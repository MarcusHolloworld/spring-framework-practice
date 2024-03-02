package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {
	
	private Samosa somosa;
	@Value("Rohit")
	private String name;
	@Value("34")
	private int rollno;
	
	
	public Student(Samosa somosa,String name,int rollno) {
		super();
		this.somosa = somosa;
		this.name = name;
		this.rollno = rollno;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public Samosa getSomosa() {
		return somosa;
	}


	public void setSomosa(Samosa somosa) {
		this.somosa = somosa;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void study() {
		this.somosa.display();
		System.out.println("student is reading book");
	}


	@Override
	public String toString() {
		return "Student [somosa=" + somosa + ", name=" + name + ", rollno=" + rollno + "]";
	}
	
	
}
