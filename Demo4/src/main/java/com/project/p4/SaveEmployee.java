package com.project.p4;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Likith");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee e=new Employee();
		e.setId(1);
		e.setName("raj");
		e.setJoinDate(LocalDate.of(2000,12,23));
		e.setSalary(123456l);
		e.setEmailId("raj@gmail.com");
		
		et.begin();
		em.persist(e);
		et.commit();
		
		
		
		
	}
}
