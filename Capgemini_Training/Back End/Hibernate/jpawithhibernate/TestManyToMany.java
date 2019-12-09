package com.capgemini.jpawithhibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.manytomany.Course;
import com.capgemini.jpawithhibernate.manytomany.Student;

public class TestManyToMany {

	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction ts = null;
		List<Course> list = new ArrayList<Course>();
		Course c = new Course();
		c.setCid(101);
		c.setCname("Mathematics");
		list.add(c);
		
		Course c1 = new Course();
		c1.setCid(102);
		c1.setCname("History");
		list.add(c1);
		
		Student s= new Student();
		s.setSid(1);
		s.setName("Snehal");
		s.setCourse(list);
		
		Student s1= new Student();
		s1.setSid(2);
		s1.setName("Anjali");
		s1.setCourse(list);
		try {
			emf = Persistence.createEntityManagerFactory("Test");
			em = emf.createEntityManager();
			ts = em.getTransaction();
			ts.begin();
			//em.persist(s);
			//em.persist(s1);
			Course course = em.find(Course.class, 101);
			System.out.println("Students details for course "+course.getCname());
			System.out.println("Student id :"+course.getStudent().get(0).getSid());
			System.out.println("Student Name :"+course.getStudent().get(0).getName());
			System.out.println("Student id :"+course.getStudent().get(1).getSid());
			System.out.println("Student Name :"+course.getStudent().get(1).getName());
			
			ts.commit();
		} catch (Exception e) {
			ts.rollback();
			e.printStackTrace();
		}
	}

}
