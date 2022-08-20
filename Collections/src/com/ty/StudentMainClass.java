package com.ty;

import java.util.ArrayList;

public class StudentMainClass {
	public static void main(String[] args) {
		Student s1=new Student(22);
		Student s2=new Student(24);
		
		ArrayList<Student> a=new ArrayList<Student>();
		a.add(s1);
		a.add(s2);
		
		for(Student i:a) {
			System.out.println(i);
		}
	}
}
