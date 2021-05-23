package com.ecom.order.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecom.api.model.Customer;
import com.ecom.api.model.Order;

public interface OrderResource {
	@PostMapping("/v1/orders")
    ResponseEntity<Order> saveEmployee(@Valid@RequestBody Order order);
	 @RequestMapping("/v1/orders/{id}")
	ResponseEntity<Order> employeeGetById(@PathVariable("id") String id);

}
