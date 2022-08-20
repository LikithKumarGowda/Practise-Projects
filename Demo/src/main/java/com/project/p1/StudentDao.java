package com.project.p1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDao {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Likith");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student e = new Student();
		e.setId(5);
		e.setName("nograj");
		e.setAge(21);
		e.setGender("male");
		e.setEmail("nograj@gmail.com");
		e.setMobileNumber(5234567890l);

		et.begin();
		em.persist(e); // for creating a new object in the database
		et.commit();

	}
}
