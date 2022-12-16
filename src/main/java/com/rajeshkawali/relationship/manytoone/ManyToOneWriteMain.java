package com.rajeshkawali.relationship.manytoone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToOneWriteMain {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mydb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		
		
		ManyToOnePerson person1 = new ManyToOnePerson();
        person1.setName("Laksh");
        person1.setDob(new Date());
        person1.setIsActive(true);
        
        List<ManyToOneCompany> companyList = new ArrayList<ManyToOneCompany>();
        
        ManyToOneCompany company1 = new ManyToOneCompany();
        company1.setTitle("Java developer");
        company1.setEmail("rajesh@gmail.com");
        company1.setPhone("1234567890");
        company1.setPerson(person1);
        
        ManyToOneCompany company2 = new ManyToOneCompany();
        company2.setTitle("UI developer");
        company2.setEmail("keshav@gmail.com");
        company2.setPhone("98989967890");
        company2.setPerson(person1);
        
        ManyToOneCompany company3 = new ManyToOneCompany();
        company3.setTitle("DBA");
        company3.setEmail("rajesh@gmail.com");
        company3.setPhone("989899690");
        company3.setPerson(person1);
        
        companyList.add(company1);
        companyList.add(company2);
        companyList.add(company3);
        person1.setCompany(companyList);
                
        entityManager.persist(person1);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
