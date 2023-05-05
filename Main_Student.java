package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main_Student {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nikith");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student student = new Student();
		student.setId(101);
		student.setName("ABC");
		student.setAge(22);
		student.setMarks(90);
		
		Student student1 = new Student();
		student1.setId(102);
		student1.setName("DEF");
		student1.setAge(22);
		student1.setMarks(95);
		
		Student student2 = new Student();
		student2.setId(103);
		student2.setName("GHI");
		student2.setAge(20);
		student2.setMarks(45);
		
		Student student3 = new Student();
		student3.setId(104);
		student3.setName("JKL");
		student3.setAge(21);
		student3.setMarks(51);
		
		Student student4 = new Student();
		student4.setId(105);
		student4.setName("MNO");
		student4.setAge(19);
		student4.setMarks(80);
		
		Course course= new Course();
		course.setId(1);
		course.setTname("Faizen");
		course.setSubject("Java");
		course.setCoursefee(30000);
		
		Course course1= new Course();
		course1.setId(2);
		course1.setTname("Uday");
		course1.setSubject("Project");
		course1.setCoursefee(36000);
		
		Course course2= new Course();
		course2.setId(3);
		course2.setTname("Venkatesh");
		course2.setSubject("Frameworks");
		course2.setCoursefee(37000);
		
		Course course3= new Course();
		course3.setId(4);
		course3.setTname("Lavanya");
		course3.setSubject("WebTechnologies");
		course3.setCoursefee(30000);

		List<Course> list = new ArrayList<Course>();
		list.add(course);
		list.add(course1);
		
		List<Course> list1 = new ArrayList<Course>();
		list1.add(course2);
		list1.add(course3);
		
		student.setCourses(list);
		student1.setCourses(list);
		student2.setCourses(list1);
		student3.setCourses(list1);
		student4.setCourses(list);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(student1);		
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityManager.persist(student4);
		entityManager.persist(course);
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityTransaction.commit();
	}
	
}
