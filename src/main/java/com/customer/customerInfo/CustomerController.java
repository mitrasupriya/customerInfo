package com.customer.customerInfo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerInfoDAO customerInfoDAO;
	
	@GetMapping("/customerId/{customerId}")
	public Optional<Customer>getCustomerData(@PathVariable String customerId){
		return customerInfoDAO.getcustomerData(customerId);
	}
}
