package com.rajeshkawali.relationship.onetoone;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneWriteMain {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mydb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		
		
		OneToOnePerson person = new OneToOnePerson();
        person.setName("Laksh");
        person.setDob(new Date());
        person.setIsActive(true);
        
        OneToOneCompany company = new OneToOneCompany();
        company.setTitle("Java developer");
        company.setEmail("rajesh@gmail.com");
        company.setPhone("1234567890");
        person.setCompany(company);
                
        entityManager.persist(person);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
