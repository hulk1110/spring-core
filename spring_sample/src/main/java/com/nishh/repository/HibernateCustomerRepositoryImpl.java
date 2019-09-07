package com.nishh.repository;

import java.util.ArrayList;
import java.util.List;

import com.nishh.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {

		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstName("Nishant");
		customer.setLastname("srivastava");
		customers.add(customer);
		return customers;
	}
}
