package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Pan;
import com.ty.onetoone.dto.Person;

public class TestSavePersonPan {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = new Person();
		person.setName("uday");
		person.setEmail("uday4141@mail.com");
		person.setPhone("9978776655");
		
		Pan pan = new Pan();
		pan.setPanNumber("UDY100TY");
		pan.setAddress("Bangalore BTR");
		
		person.setPan(pan);
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
	}
}
