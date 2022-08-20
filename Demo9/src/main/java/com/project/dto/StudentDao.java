package com.project.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDao {
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("Likith");
		EntityManager em=emf.createEntityManager();
		
		
		//Save a Student details
		
		Student s1=em.find(Student.class, 1);
		
		System.out.println(s1.getAge());
		System.out.println(s1.getId());
	}
		
}
