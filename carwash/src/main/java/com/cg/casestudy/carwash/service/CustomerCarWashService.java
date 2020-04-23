/**
 * 
 */
package com.cg.casestudy.carwash.service;

import com.cg.casestudy.carwash.entity.CustomerCarWashEntity;
import com.cg.casestudy.carwash.exception.CustomerCarWashException;

/**
 * @author bano
 *
 */
public interface CustomerCarWashService {
	
 public String login(CustomerCarWashEntity customerCarWashEntity)throws CustomerCarWashException;
}
