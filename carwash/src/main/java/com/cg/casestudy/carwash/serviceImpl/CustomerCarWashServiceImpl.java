/**
 * 
 */
package com.cg.casestudy.carwash.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.casestudy.carwash.dao.CustomerCarWashDao;
import com.cg.casestudy.carwash.entity.CustomerCarWashEntity;
import com.cg.casestudy.carwash.exception.CustomerCarWashException;
import com.cg.casestudy.carwash.service.CustomerCarWashService;

/**
 * @author bano
 *
 */
@Service
public class CustomerCarWashServiceImpl implements CustomerCarWashService{

	@Autowired
	private CustomerCarWashDao customerCarWashDao;

	public void setLoginDao(CustomerCarWashDao customerCarWashDao) {
		this.customerCarWashDao = customerCarWashDao;
	}

	@Override
	public String login(CustomerCarWashEntity customerDetails) throws CustomerCarWashException {

		String result = customerCarWashDao.findCustomer(customerDetails);
		if (result==null) {
			throw new CustomerCarWashException("error");
		}
		return "success";

	}
}
