package com.capgemini.jpawithhibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetomany.Pencil;
import com.capgemini.jpawithhibernate.onetomany.PencilBox;


public class TestManyToOne {

	public static void main(String[] args) {

		EntityManager entityManager =null;
		EntityTransaction transaction =null;
		PencilBox pb =new PencilBox();
		pb.setBox_id(12);
		pb.setName("Camlin");
		
		Pencil p = new Pencil();
		p.setPid(1);
		p.setColor("Black");
		p.setPencilbox(pb);
		
		Pencil p1 = new Pencil();
		p1.setPid(2);
		p1.setColor("Grey");
		p1.setPencilbox(pb);
		
		try {//if there will be exception in future while inserting data ,we are using this try catch block
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager= entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(p);
			entityManager.persist(p1);
			System.out.println("Record saved");
			transaction.commit();
			PencilBox details = entityManager.find(PencilBox.class, 12);
			List<Pencil> al=details.getPencil();
			for(Pencil a :al)
			{
				System.out.println(a);
			}
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
		entityManager.close();
	}

}
