package com.project.p4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMultiplePersons {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Likith");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		List<Person> person=new ArrayList<Person>();
		int out=0;
		while(out==0) {
			Person p=new Person();
			System.out.println("Enter the person id:");
			p.setId(sc.nextInt());
			System.out.println("Enter the person name:");
			p.setName(sc.next());
			System.out.println("Enter the person phone number:");
			p.setPhone(sc.nextLong());
			System.out.println("Enter the person email:");
			p.setEmail(sc.next());
			
			person.add(p);
			System.out.println("press 0 to continue or 1 to exit");
			out=sc.nextInt();

		}
		et.begin();
		for(Person p1:person) {
			em.persist(p1);
		}
		et.commit();
		sc.close();
	}
}
