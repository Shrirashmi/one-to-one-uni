package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.BankAddress;
import com.ty.onetoone.dto.BankBranch;

public class TestSaveBranchAddress {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		BankBranch bankBranch = new BankBranch();
		bankBranch.setName("ICICI");
		bankBranch.setIfscCode("ICICI008");
		bankBranch.setPhone(98982369l);
		
		BankAddress address = new BankAddress();
		address.setArea("Pune");
		address.setState("MH");
		address.setCountry("IND");
		
		bankBranch.setAddress(address);
		
		entityTransaction.begin();
		entityManager.persist(bankBranch);
		entityManager.persist(address);
		entityTransaction.commit();
	}
}
