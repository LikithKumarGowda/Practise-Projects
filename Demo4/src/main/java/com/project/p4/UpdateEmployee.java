package com.project.p4;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Likith");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee e=em.find(Employee.class, 1);
		e.setId(1);
		e.setName("vaibhav");
		e.setJoinDate(LocalDate.of(2000,12,23));
		e.setSalary(13456l);
		e.setEmailId("vaibhav@gmail.com");
		
		et.begin();
		em.merge(e);
		et.commit();
	}
}
