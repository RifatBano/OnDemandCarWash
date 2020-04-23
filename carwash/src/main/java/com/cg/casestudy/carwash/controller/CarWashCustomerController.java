package com.cg.casestudy.carwash.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.casestudy.carwash.dao.CustomerCarWashDao;
import com.cg.casestudy.carwash.entity.CustomerCarWashEntity;
import com.cg.casestudy.carwash.exception.CustomerCarWashException;
import com.cg.casestudy.carwash.service.CustomerCarWashService;

@RestController
@RequestMapping(value="")
public class CarWashCustomerController {

	private final Logger LOG = LoggerFactory.getLogger(CarWashCustomerController.class);
	
	@Autowired
	public CustomerCarWashService customerCarWashService;
	
	
	@RequestMapping(value = "/user", method = RequestMethod.POST, consumes = "application/json", produces = "text/plain")
	public String checkCustomerLogin(@RequestBody CustomerCarWashEntity customer) throws CustomerCarWashException {		
		LOG.info("Getting all users.");

	try {
		customerCarWashService.login(customer);
	} catch (Exception e) {
		throw new CustomerCarWashException("Error Occurred");
	}
	return "Logged In Successfully";
}

	
	
}
