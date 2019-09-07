package com.nishh.repository;

import java.util.List;

import com.nishh.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}