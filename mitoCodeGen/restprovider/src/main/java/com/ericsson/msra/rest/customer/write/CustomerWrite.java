package com.ericsson.msra.rest.customer.write;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.ericsson.msra.rest.customer.models.*;
import com.ericsson.msra.rest.customer.exceptions.CustomerNotFoundException;
import com.ericsson.msra.rest.customer.exceptions.InternalServerErrorException;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

/**
 * 
 * @author 
 *
 * This interface need to be implemented 
 * and the the methods need to be overwritten to implement business logic.
 *
 */

 

@Api(value = "CustomerWrite", tags = { "CustomerWrite" })
@RestController

@RequestMapping(value = "api/v2")
public interface CustomerWrite {

	
		@ApiOperation(value = "write Customer Details", nickname = "createCustomer", response = CustomerTO.class)
	@ApiResponses(value = {
	@ApiResponse(code = 404, message = "Not Found", response = CustomerNotFoundException.class),				
	@ApiResponse(code = 500, message = "Internal server erroe", response = InternalServerErrorException.class),				
@ApiResponse(code = 201, message = "Created", response = CustomerTO.class) })
	@RequestMapping(value = "/customer/write", produces = { "application/json;charset=utf-8" }, consumes = {
			"application/json;charset=utf-8" }, method = RequestMethod.POST)
	public CustomerTO createCustomer(CustomerTO customer);






	

}



