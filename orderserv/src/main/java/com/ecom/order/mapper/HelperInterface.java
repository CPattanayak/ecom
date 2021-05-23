package com.ecom.order.mapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public interface HelperInterface {
	default Date returnCurrentDate() {
		
        
        return new Date();
    }
}
