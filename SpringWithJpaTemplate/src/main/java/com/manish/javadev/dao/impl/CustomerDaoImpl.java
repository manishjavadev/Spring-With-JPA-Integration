package com.manish.javadev.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.manish.javadev.dao.CustomerDAO;
import com.manish.javadev.model.Customer;
import com.manish.javadev.to.CustomerTO;

public class CustomerDaoImpl implements CustomerDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public void addCustomer(CustomerTO cto) {
		Customer customer = new Customer(cto.getFirstName(), cto.getLastName(),
				cto.getAge(), cto.getCity());
		entityManager.persist(customer);
		System.out.println("addCustomer Done");
		System.out.println("entityManager== " + entityManager);
	}

	public void updateCustomer(int custId) {
		// TODO Auto-generated method stub

	}

	public void deleteCustomer(int custId) {
		// TODO Auto-generated method stub

	}

	public List<CustomerTO> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	public CustomerTO getCustomerById(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

}
