package com.rajeshkawali.relationship.embedded;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmbeddedReadMain {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mydb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		
		
		PersonEmbedded person = entityManager.find(PersonEmbedded.class, 1);
		System.out.println("Person details : "+person);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
