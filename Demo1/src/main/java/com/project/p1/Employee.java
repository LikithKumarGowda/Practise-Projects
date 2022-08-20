package com.project.p1;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {

	@Id
	private int id;

	private String name;

	private String emailId;

	private int age;

	private String gender;

	
	
	public Employee() {
		System.out.println("Please enter valid data");
	}

	

	public Employee(int id, String name, String emailId, int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.age = age;
		this.gender = gender;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
