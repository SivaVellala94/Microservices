package com.springcloud.microservices.limits_service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.microservices.limits_service.Bean.Limits;
import com.springcloud.microservices.limits_service.Configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits getData() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}

}
