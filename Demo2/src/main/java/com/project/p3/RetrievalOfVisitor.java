package com.project.p3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RetrievalOfVisitor {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Likith");
		EntityManager em=emf.createEntityManager();
		
		Visitors v=em.find(Visitors.class, 1);
		
		System.out.println("Id:"+v.getId());
		System.out.println("Name:"+v.getName());
		System.out.println("Email"+v.getEmail());
		System.out.println("DOB:"+v.getDob());
		System.out.println("VisitTime:"+v.getVisitDateTime());
		System.out.println("ExitTime"+v.getExitTime());

	}
}
