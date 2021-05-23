package com.ecom.order.mapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.ecom.api.model.Customer;
import com.ecom.api.model.Order;

import com.ecom.order.dao.OrderDao;
import com.ecom.order.dao.OrderStatus;

@Mapper(componentModel = "spring")
public interface OrderServiceMapper extends HelperInterface,DateHelperInterface,StatusToString{
	OrderServiceMapper INSTANCE = Mappers.getMapper( OrderServiceMapper.class );
	@Mapping( target = "status", expression = "java(createdStatus())")
	@Mapping( target = "dateOfPurchase", expression = "java(returnCurrentDate())")
	OrderDao convertDtoToDao(Order order);
	@Mapping( target = "dateOfPurchase", expression = "java(dateToString(dao.getDateOfPurchase()))")
	@Mapping( target = "status", expression = "java(convertStatusToString(dao.getStatus()))")
	Order convertDaoToDto(OrderDao dao);
	default OrderStatus createdStatus() {
		
        
        return OrderStatus.CREATED;
    }

}
