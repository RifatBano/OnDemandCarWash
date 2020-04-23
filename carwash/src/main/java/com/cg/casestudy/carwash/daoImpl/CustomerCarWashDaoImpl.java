package com.cg.casestudy.carwash.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.cg.casestudy.carwash.dao.CustomerCarWashDao;
import com.cg.casestudy.carwash.entity.CustomerCarWashEntity;
import com.cg.casestudy.carwash.exception.CustomerCarWashException;

@Repository
public class CustomerCarWashDaoImpl implements CustomerCarWashDao{
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public String findCustomer(CustomerCarWashEntity customerdetails) throws CustomerCarWashException {
		// TODO Auto-generated method stub

		String customerName = customerdetails.getCustomername();
		try {
			Query query = new Query();
			query = query.addCriteria(Criteria.where("customername").is(customerName));

			boolean CustomerExists = mongoTemplate.exists(query, "CustomerLogin");
			if (CustomerExists) {
				return "success";
			}
		} catch (Exception e) {
			throw new CustomerCarWashException("login error");
		}
		return "failed";

	}

	
	
}
