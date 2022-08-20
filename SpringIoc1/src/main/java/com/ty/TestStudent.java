package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring1.xml");
		Student s=(Student)context.getBean("myStudent");
		System.out.println(s.getAge());
		System.out.println(s.getId());
		System.out.println(s.getName());

	}
}
