package com.ecom.order.dao;

import java.util.stream.Stream;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderStatus {
	CREATED("CREATED"),
	CANCELED("CANCELED"),
	FULFILED("FULFILD"),
	UPDATED("UPDATED");
	
    private String code;
	
	private OrderStatus(String code) {
		this.code=code;
	}
	
	@JsonCreator
	public static OrderStatus decode(final String code) {
		 
		return Stream.of(OrderStatus.values()).filter(targetEnum -> targetEnum.code.equals(code)).findFirst().orElse(null);
	}
	
	@JsonValue
	public String getCode() {
		return code;
	}

}
