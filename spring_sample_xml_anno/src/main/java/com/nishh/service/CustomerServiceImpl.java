package com.nishh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nishh.model.Customer;
import com.nishh.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	// private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
