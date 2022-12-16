package com.rajeshkawali.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class BasicMain {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mydb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        
        Person person = new Person();
        person.setName("Laksh");
        person.setGender(Gender.MALE);
        person.setDob(new Date());
        person.setIsActive(true);
        
        List<String> favoriteFruits = new ArrayList<String>();
        favoriteFruits.add("Mango");
        favoriteFruits.add("Apple");
        person.setFavoriteFruits(favoriteFruits);
        
        entityManager.persist(person);
         
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
	}
}
