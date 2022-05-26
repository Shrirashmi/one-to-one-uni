package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Company;
import com.ty.onetoone.dto.Gst;

public class TestSaveGstCompany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Gst gst = new Gst();
		gst.setGstNumber("22");
		gst.setState("Karnataka");
		gst.setCountry("India");
		
		Company company = new Company();
		company.setName("Qspiders");
		company.setPhone("900975236");
		company.setWeb("www.qspy.com");
		gst.setCompany(company);
		
		entityTransaction.begin();
		entityManager.persist(gst);
		entityManager.persist(company);
		entityTransaction.commit();
	}
}
