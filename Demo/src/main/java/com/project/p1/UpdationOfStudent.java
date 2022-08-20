package com.project.p1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdationOfStudent {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Likith");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student e = new Student();
		e.setAge(23);
		e.setId(4);
		e.setName("nodsa");
		e.setGender("male");
		e.setEmail("nograj@gmail.com");
		e.setMobileNumber(5234567890l);
		
		//              Note : we should specify every variable data while updating.If not we get null in the database.
		
		et.begin();
		em.merge(e); // for updating and creating a new object in the database
		et.commit();
	}
}
