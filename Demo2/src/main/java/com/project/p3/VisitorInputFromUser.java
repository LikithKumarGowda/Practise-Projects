package com.project.p3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class VisitorInputFromUser {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Likith");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Scanner sc=new Scanner(System.in);
		List<Visitors> visitors=new ArrayList<Visitors>();
		int exit=0;
		while(exit==0) {
			Visitors v=new Visitors();
			System.out.println("Enter the Id:");
			v.setId(sc.nextInt());
			System.out.println("Enter the Name:");
			v.setName(sc.next());
			System.out.println("Enter the Email:");
			v.setEmail(sc.next());
			System.out.println("Enter the DOB:");
			v.setDob(LocalDate.now());
			System.out.println("Enter the Visiting Time :");
			v.setVisitDateTime(LocalDateTime.now());
			System.out.println("Enter the Exit time:");
			v.setExitTime(LocalDateTime.now());
			System.out.println("*****************************************************************************************");
			visitors.add(v);
			System.out.println("Enter 1 to exit or 0 to continue addind data: ");
			exit=sc.nextInt();	
		}
		et.begin();
		for(Visitors v1:visitors) {
			em.persist(v1);
		}
		et.commit();
		
		
		sc.close();
	}
	
}
