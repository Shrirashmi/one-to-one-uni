package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.BankAddress;
import com.ty.onetoone.dto.BankBranch;

public class TestGetBranchAddress {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		BankBranch bankBranch = entityManager.find(BankBranch.class, 1);
		System.out.println("-----------------------------");
		System.out.println("Bank Name: " + bankBranch.getName());
		System.out.println("IFSC Code: " + bankBranch.getIfscCode());
		System.out.println("Phone: " + bankBranch.getPhone());
		BankAddress address = bankBranch.getAddress();
		System.out.println("Area: " + address.getArea());
		System.out.println("State: "  +address.getState());
		System.out.println("Country: " + address.getCountry());
	}
}
