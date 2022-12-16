package com.rajeshkawali.relationship.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneReadMain {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mydb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		
		//To read the data from db, then change hbm2ddl- update
		OneToOnePerson person = entityManager.find(OneToOnePerson.class, 1);
		System.out.println("Person details : "+person);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
