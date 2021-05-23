package com.ecom.customer.mapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.ecom.api.model.Customer;
import com.ecom.customer.dao.CustomerDao;
@Mapper(componentModel = "spring")
public interface CustomerServiceMapper {
	CustomerServiceMapper INSTANCE = Mappers.getMapper( CustomerServiceMapper.class );
	@Mapping(source = "dateOfBirth", dateFormat = "yyyy-mm-dd",target="dateOfBirth")
	CustomerDao convertDtoToDao(Customer customer);
	@Mapping(target = "dateOfBirth", expression = "java(dateToString(customerDao.getDateOfBirth()))")  
	Customer convertDaoToDto(CustomerDao customerDao);
	
	
	default String dateToString(Date dateOfBirth) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        
        return dateFormat.format(dateOfBirth);
    }

}
