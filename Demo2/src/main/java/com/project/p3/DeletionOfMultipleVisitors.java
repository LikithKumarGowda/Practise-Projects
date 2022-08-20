package com.project.p3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletionOfMultipleVisitors {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Likith");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Scanner sc=new Scanner(System.in);
		List<Visitors> visitors=new ArrayList<Visitors>();
		
		int exit=0;
		while(exit==0) {
			System.out.println("Enter the id to be deleted:");
			
			Visitors v=em.find(Visitors.class, sc.nextInt());
			visitors.add(v);
			System.out.println("Enter 1 to exit or 0 to continue addind data: ");
			exit=sc.nextInt();	
		}
		et.begin();
		for(Visitors v1:visitors) {
			em.remove(v1);
		}
		et.commit();
		
		
		sc.close();
	}
}
