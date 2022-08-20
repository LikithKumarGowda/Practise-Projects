package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("Spring.xml");
		Person p=(Person)context.getBean("myperson");
		System.out.println(p.getAge());
		System.out.println(p.getName());
		
	}
}
