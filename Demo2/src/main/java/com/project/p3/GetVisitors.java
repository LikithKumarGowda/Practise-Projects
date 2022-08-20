package com.project.p3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetVisitors {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Likith");
		EntityManager em=emf.createEntityManager();
		
		String sql="select v from Visitors v";
		Query query=em.createQuery(sql);
		
		List<Visitors> v=query.getResultList();
		
		
		for(Visitors v1:v) {
			System.out.println("Id:"+v1.getId());
			System.out.println("Name:"+v1.getName());
			System.out.println("Email:"+v1.getEmail());
			System.out.println("DOB:"+v1.getDob());
			System.out.println("VisitTime:"+v1.getVisitDateTime());
			System.out.println("ExitTime:"+v1.getExitTime());
			System.out.println("***************************************************************************************");
		}
		
	}
}
