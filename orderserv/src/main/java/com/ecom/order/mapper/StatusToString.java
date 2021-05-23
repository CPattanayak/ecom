package com.ecom.order.mapper;

import com.ecom.order.dao.OrderStatus;

public interface StatusToString {
	default String convertStatusToString(OrderStatus status) {
		return status.getCode();
		
	}

}
