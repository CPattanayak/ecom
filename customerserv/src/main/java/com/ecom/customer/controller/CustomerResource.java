package com.ecom.customer.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecom.api.model.Customer;



public interface CustomerResource {
    @RequestMapping("/v1/customers/{id}")
    ResponseEntity<Customer> employeeGetById(@PathVariable("id") String id);
    
    @PostMapping("/v1/customers")
    ResponseEntity<Customer> saveEmployee(@Valid@RequestBody Customer customer);

}
