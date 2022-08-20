package com.project.p1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletionOfStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Likith");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student e = em.find(Student.class, 4);

		et.begin();
		em.remove(e); // for deleting a object in the database
		et.commit();

	}
}
