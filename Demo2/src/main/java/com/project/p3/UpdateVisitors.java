package com.project.p3;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateVisitors {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Likith");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Visitors v=new Visitors();
		v.setId(1);
		v.setName("likith");
		v.setEmail("likith@gmail.com");
		v.setDob(LocalDate.of(2000, 12, 8));
		v.setVisitDateTime(LocalDateTime.of(2022,6,12,8, 45));
		v.setExitTime(LocalDateTime.of(2022, 6,12,11,45));
		
		et.begin();
		em.merge(v);
		et.commit();
		
	}
}
