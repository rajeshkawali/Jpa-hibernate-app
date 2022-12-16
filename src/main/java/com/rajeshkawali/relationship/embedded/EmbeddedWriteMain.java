package com.rajeshkawali.relationship.embedded;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmbeddedWriteMain {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mydb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		PersonEmbedded person = new PersonEmbedded();
		person.setName("Laksh");
		person.setGender(Gender.MALE);
		person.setDob(new Date());
		person.setIsActive(true);

		List<String> favoriteFruits = new ArrayList<String>();
		favoriteFruits.add("Mango");
		favoriteFruits.add("Apple");

		Company company = new Company();
		company.setTitle("Java developer");
		company.setEmail("laksh@gmail.com");
		company.setPhone("98989898909");
		
		Location location = new Location();
		location.setCountry("India");
		location.setState("Maharashtra");
		location.setCity("Mumbai");
		location.setPin(400092L);
		
		company.setLocation(location);
		person.setFavoriteFruits(favoriteFruits);
		person.setCompany(company);
		
		entityManager.persist(person);

		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
