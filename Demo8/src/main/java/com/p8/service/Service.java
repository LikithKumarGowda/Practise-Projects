package com.p8.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.project.dto.Mobile;
import com.project.dto.Sim;

public class Service {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Likith");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Mobile mob=new Mobile();
		mob.setName("sdfafe");
		mob.setBrand("vsgv");
		mob.setCost(2345.0987);
		
		Sim s1=new Sim();
		s1.setNetworkName("jio");
		s1.setType("5g");
		Sim s2=new Sim();
		s2.setNetworkName("Vi");
		s2.setType("3g");
		Sim s3=new Sim();
		s3.setNetworkName("Airtel");
		s3.setType("4g");
		
		List<Sim> sims=new ArrayList<Sim>();
		sims.add(s1);
		sims.add(s2);
		sims.add(s3);
		
		mob.setSims(sims);
		
		et.begin();
		em.persist(mob);
		for(Sim s:sims) {
			em.persist(s);
		}
		et.commit();
	}
}
