package com.project.p1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetMultipleStudents {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Likith");
		EntityManager em = emf.createEntityManager();

		String sql = "select e from Student e";
		Query query = em.createQuery(sql);
		List<Student> student = query.getResultList();

		for (Student student1 : student) {
			System.out.println("Id:" + student1.getId());
			System.out.println("Name:" + student1.getName());
			System.out.println("Age:" + student1.getAge());
			System.out.println("Gender:" + student1.getGender());
			System.out.println("Email:" + student1.getEmail());
			System.out.println("MobileNumber:" + student1.getMobileNumber());

			System.out.println("*******************************************************************************");
		}
	}
}
