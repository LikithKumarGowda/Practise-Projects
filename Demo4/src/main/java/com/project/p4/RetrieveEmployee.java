package com.project.p4;


import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RetrieveEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Likith");
		EntityManager em=emf.createEntityManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id nos to be retrieved");
		int id1=sc.nextInt();
		Employee e=em.find(Employee.class, id1);
		System.out.println("Id: "+e.getId());
		System.out.println("Name: "+e.getName());
		System.out.println("DateOfJoining: "+e.getJoinDate());
		System.out.println("Salary: "+e.getSalary());
		System.out.println("EmailId: "+e.getEmailId());
		System.out.println("***************************************************************************");
		sc.close();
	}
}
