package com.project.p4;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("Likith");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person p=new Person();
		p.setId(5);
		p.setName("rajkumar");
		p.setPhone(1234567890);
		p.setEmail("raj@gmail.com");
		
		et.begin();
		em.persist(p);
		et.commit();
	}
}
