package com.ty;

public class Student {
	public int age;
	Student(int age){
		this.age=age;
	}
	
	@Override
	public String toString() {
		
		return "Student age is : "+age; 
	}
}
