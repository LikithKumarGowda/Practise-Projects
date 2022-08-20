package com.project.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.project.dto.Person;
import com.project.dto.PersonPan;

public class PersonDao {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("Likith");
	
	public void savePersonPan(Person p,PersonPan pan) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(p);
		em.persist(pan);
		et.commit();
		
	}
	
	public PersonPan GetPersonPanById(int id) {
		
		EntityManager em=emf.createEntityManager();
		
		PersonPan pan = em.find(PersonPan.class, id);
		
		return pan;
		
	}
}
