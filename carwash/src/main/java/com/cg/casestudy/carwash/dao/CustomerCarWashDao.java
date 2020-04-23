package com.cg.casestudy.carwash.dao;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.cg.casestudy.carwash.entity.CustomerCarWashEntity;
import com.cg.casestudy.carwash.exception.CustomerCarWashException;

import org.springframework.stereotype.Repository;

/*
 * 
 */

public interface CustomerCarWashDao{

	public String findCustomer(CustomerCarWashEntity customerdetails) throws CustomerCarWashException;
}
