package com.rajeshkawali.relationship.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyReadMain {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mydb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		
		//To read the data from db, then change hbm2ddl- update
		OneToManyPerson person = entityManager.find(OneToManyPerson.class, 2);
		System.out.println("Person details : "+person.toString());
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
