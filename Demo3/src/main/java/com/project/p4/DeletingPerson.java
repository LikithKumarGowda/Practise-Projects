package com.project.p4;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletingPerson {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Likith");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		System.out.println("Enter the person id to be deleted ");
		Person p=em.find(Person.class, sc.nextInt());
		
		
		
		
		
		
		et.begin();
		em.remove(p);
		et.commit();
		sc.close();
		
	}
}
