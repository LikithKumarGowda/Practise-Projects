package com.project.p1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RetrievalOfStudentData {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Likith");
		EntityManager em = emf.createEntityManager();
		//EntityTransaction et = em.getTransaction();  
		//Not required because we do not need to do any operation like begin remove or merge.

		Student e = em.find(Student.class, 1);
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getGender());
		System.out.println(e.getEmail());
		System.out.println(e.getMobileNumber());
	}
}
