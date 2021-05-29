package com.ecom.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class GatewayCircuitBreakHandler {
	public String getAccount() {
        
        return "gateway is down";
    }

}
