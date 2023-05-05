package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update_Marks {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nikith");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student student= entityManager.find(Student.class, 101);
		student.setMarks(91);
		
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();

	}

}
