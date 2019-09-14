package com.nishh.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.nishh.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUserName}")
	private String dbUserName;
	
	@Override
	public List<Customer> findAll() {
System.out.println("db user name is "+dbUserName);
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstName("Nishant");
		customer.setLastname("srivastava");
		customers.add(customer);
		return customers;
	}
}
