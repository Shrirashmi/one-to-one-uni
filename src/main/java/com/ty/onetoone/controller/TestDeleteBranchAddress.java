package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.BankAddress;
import com.ty.onetoone.dto.BankBranch;

public class TestDeleteBranchAddress {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		BankBranch bankBranch = entityManager.find(BankBranch.class, 2);
		if(bankBranch!=null) {
		BankAddress address = bankBranch.getAddress();
		entityTransaction.begin();
		entityManager.remove(address);
		entityManager.remove(bankBranch);
		entityTransaction.commit();
		System.out.println("BankBranch deleted");
		}
		else
		{
			System.out.println("Branch doesnt exist");
		}
	}
}
