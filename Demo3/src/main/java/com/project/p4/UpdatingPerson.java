package com.project.p4;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdatingPerson {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Likith");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Person p=new Person();
		System.out.println("Enter the person id:");
		p.setId(sc.nextInt());
		System.out.println("Enter the person name:");
		p.setName(sc.next());
		System.out.println("Enter the person phone number:");
		p.setPhone(sc.nextLong());
		System.out.println("Enter the person email:");
		p.setEmail(sc.next());
		
		et.begin();
		em.merge(p);
		et.commit();
		sc.close();
	}
}
