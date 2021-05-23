package com.ecom.customer.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.api.model.Customer;
import com.ecom.customer.dao.CustomerDao;
import com.ecom.customer.mapper.CustomerServiceMapper;
import com.ecom.customer.repo.CustomerRepository;
import com.ecom.validation.exception.CustomerNotFoundException;


@RestController
public class CustomerController implements CustomerResource {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CustomerServiceMapper mapper;
	@Override
	public ResponseEntity<Customer> employeeGetById(String id) {
		Optional<CustomerDao> customer = customerRepository.findById(Integer.valueOf(id));
    	if (!customer.isPresent())
    	      throw new CustomerNotFoundException("id-" + id);;
    	Customer customerRes = mapper.convertDaoToDto(customer.get());
        return new ResponseEntity<>(customerRes, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Customer> saveEmployee(@Valid Customer customer) {
		CustomerDao customerDao = mapper.convertDtoToDao(customer);
		customerDao=customerRepository.save(customerDao);
		Customer returnedEmp = mapper.convertDaoToDto(customerDao);

		return new ResponseEntity<>(returnedEmp, HttpStatus.OK);
	}

}
