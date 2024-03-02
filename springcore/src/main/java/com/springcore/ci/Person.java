package com.springcore.ci;

import java.util.List;

public class Person {
	
	private String name;
	private int personId;
	private Certi certi;
	private List<String> phone;
	
	public Person(String name, int personId, Certi certi , List<String> phone) {
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return this.personId + " : " + this.name + " : " + this.phone + " : { "+this.certi.name+" }";
	}
}
