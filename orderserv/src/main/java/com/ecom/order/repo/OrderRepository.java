package com.ecom.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.order.dao.OrderDao;


@Repository
public interface OrderRepository extends JpaRepository<OrderDao, Integer> {

}

