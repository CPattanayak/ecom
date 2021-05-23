package com.ecom.customer.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.customer.dao.CustomerDao;


@Repository
public interface CustomerRepository extends JpaRepository<CustomerDao, Integer> {

}
