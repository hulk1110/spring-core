package com.nishh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nishh.model.Customer;
import com.nishh.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	// private CustomerRepository customerRepository = new
	// HibernateCustomerRepositoryImpl();

	private CustomerRepository customerRepository;

	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("we are doing constructor injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
   
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("we are doing setter injection");
		this.customerRepository = customerRepository;
	}
}
