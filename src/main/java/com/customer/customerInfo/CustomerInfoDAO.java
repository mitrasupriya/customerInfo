package com.customer.customerInfo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerInfoDAO {
	@Autowired
	private CustomerInfoRepository customerInfoRepository;
	
	public Optional<Customer>getcustomerData(String customerId){
		Optional<Customer> customer = customerInfoRepository.findById(customerId);
		return customer;
	}

}
