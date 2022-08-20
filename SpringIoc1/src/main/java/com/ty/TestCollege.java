package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollege {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		College c=(College)context.getBean("myCollege");
		System.out.println("college id is  "+c.getCollegeId());
		System.out.println("college name is  "+c.getCollegeName());
		System.out.println(c.getNosOfStudents());
		System.out.println(c.getPincode());

	}
}
