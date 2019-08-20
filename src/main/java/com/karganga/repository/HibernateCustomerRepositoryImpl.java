package com.karganga.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.karganga.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	
	public List<Customer> findAll() {

		System.out.println("dbUsername:"+ dbUsername);
		
		List<Customer> customerList = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstName("Rahul");

		customer.setLastName("Karale");

		customerList.add(customer);

		return customerList;
	}

}
