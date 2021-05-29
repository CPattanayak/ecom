package com.ecom.order.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.api.model.Customer;
import com.ecom.api.model.Order;

import com.ecom.order.dao.OrderDao;
import com.ecom.order.mapper.OrderServiceMapper;
import com.ecom.order.repo.OrderRepository;

import com.ecom.validation.exception.OrderNotFoundException;
@RestController
public class OrderController implements OrderResource {
	
	@Autowired
	private OrderServiceMapper mapper;
	@Autowired
	private OrderRepository repo;
	@Override
	public ResponseEntity<Order> saveEmployee(@Valid Order order) {
		// TODO Auto-generated method stub
		OrderDao orderDao=mapper.convertDtoToDao(order);
		
		orderDao=repo.save(orderDao);
		Order returnOrder=mapper.convertDaoToDto(orderDao);
		return new ResponseEntity<>(returnOrder, HttpStatus.OK);
	}
	@Override
	public ResponseEntity<Order> employeeGetById(String id) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Optional<OrderDao> customer = repo.findById(Integer.valueOf(id));
    	if (!customer.isPresent())
    	      throw new OrderNotFoundException("id-" + id);;
    	Order customerRes = mapper.convertDaoToDto(customer.get());
        return new ResponseEntity<>(customerRes, HttpStatus.OK);
	}

}
