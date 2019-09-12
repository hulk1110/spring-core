package com.nishh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nishh.model.Customer;
import com.nishh.repository.CustomerRepository;
import com.nishh.repository.HibernateCustomerRepositoryImpl;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
