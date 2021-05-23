package com.ecom.order.mapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public interface DateHelperInterface {
	default String dateToString(Date dateOfBirth) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        
        return dateFormat.format(dateOfBirth);
    }
}
