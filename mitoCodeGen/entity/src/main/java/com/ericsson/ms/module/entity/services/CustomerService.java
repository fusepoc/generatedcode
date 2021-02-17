package com.ericsson.ms.module.entity.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

import com.ericsson.ms.module.entity.models.*;
import com.ericsson.ms.module.entity.exceptions.GenericMsEntityException;
import com.ericsson.ms.module.entity.exceptions.CustomerNotFoundException;

/**
 * 
 * @author 
 *
 * This class is an implementation of entity module specific service class.
 *
 */
public class CustomerService {

	
	public List<Customer> readCustomers()  throws GenericMsEntityException,CustomerNotFoundException {
		
		// TODO: Implement return 
		return null;
	}




	@Transactional
public Customer createCustomer(Customer cust,Long id)  throws GenericMsEntityException {
		
		// TODO: Implement return 
		return null;
	}




	

}



