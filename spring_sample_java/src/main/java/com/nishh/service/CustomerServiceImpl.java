package com.nishh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nishh.model.Customer;
import com.nishh.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	
	public CustomerServiceImpl() {
	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("using construtor injection");
		this.customerRepository = customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("using setter injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
