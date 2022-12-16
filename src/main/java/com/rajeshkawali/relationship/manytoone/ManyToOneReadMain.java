package com.rajeshkawali.relationship.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToOneReadMain {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mydb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		
		//To read the data from db, then change hbm2ddl- update
		ManyToOnePerson person = entityManager.find(ManyToOnePerson.class, 1);
		System.out.println("Person details : "+person);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
