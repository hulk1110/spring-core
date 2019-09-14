package com.nishh.repository;

import java.util.ArrayList;
import java.util.List;

import com.nishh.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	
	private String dbUsername;
	
	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	@Override
	public List<Customer> findAll() {
		System.out.println(dbUsername);

		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstName("Nishant");
		customer.setLastname("srivastava");
		customers.add(customer);
		return customers;
	}
}
