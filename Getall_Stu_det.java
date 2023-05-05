package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Getall_Stu_det {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("nikith");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select s from Student s");
		List<Student> stu = query.getResultList();
		for (Student stud : stu) 
		{
			System.out.println("The student id is= " + stud.getId());
			System.out.println("The student Name is= " + stud.getName());
			System.out.println("The student Age is= " + stud.getAge());
			System.out.println("The student Marks is= " + stud.getMarks());
			System.out.println("*********************************************");
		}

	}

}
