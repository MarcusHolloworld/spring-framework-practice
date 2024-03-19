package com.spring.orm;
import jakarta.persistence.*;



@Entity
@Table(name="teacher_details")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="teacher_name")
	private String name;
	@Column(name="teacher_address")
	private String address;
	@Column(name="contact_number")
	private long phone_no;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String name, String address, long phone_no) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone_no = phone_no;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", address=" + address + ", phone_no=" + phone_no + "]";
	}
}
