package com.rajeshkawali.relationship.onetomany;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyWriteMain {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mydb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		OneToManyPerson person1 = new OneToManyPerson();
        person1.setName("Laksh");
        person1.setDob(new Date());
        person1.setIsActive(true);

        OneToManyCompany company1 = new OneToManyCompany();
        company1.setTitle("Java developer");
        company1.setEmail("rajesh@gmail.com");
        company1.setPhone("1234567890");
        company1.setPerson(person1);
        
        OneToManyCompany company2 = new OneToManyCompany();
        company2.setTitle("UI developer");
        company2.setEmail("keshav@gmail.com");
        company2.setPhone("98989967890");
        company2.setPerson(person1);

        List<OneToManyCompany> companyList = new ArrayList<OneToManyCompany>();
        companyList.add(company1);
        companyList.add(company2);
        person1.setCompany(companyList);
        
        entityManager.persist(company1);
        entityManager.persist(company2);

        entityManager.persist(person1);

		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
