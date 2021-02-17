package com.ericsson.msra.rest.customer.read;


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

 

@Api(value = "CustomerReadQueries", tags = { "CustomerReadQueries" })
@RestController

@RequestMapping(value = "api/v1")
public interface CustomerReadQueries {

	
		@ApiOperation(value = "Read Customer Details by CustomerId", nickname = "readCustomerById", response = CustomerTO.class)
	@ApiResponses(value = {
	@ApiResponse(code = 404, message = "Not Found", response = CustomerNotFoundException.class),				
	@ApiResponse(code = 500, message = "Internal server erroe", response = InternalServerErrorException.class),				
@ApiResponse(code = 200, message = "success", response = CustomerTO.class) })
	@RequestMapping(value = "/customer/{id}", produces = { "application/json;charset=utf-8" }, consumes = {
			"application/json;charset=utf-8" }, method = RequestMethod.GET)
	public CustomerTO readCustomerById(	@ApiParam(value = "", required = true) @PathVariable String id);




	@ApiOperation(value = "Read All Customer Details", nickname = "readAllCustomer", response = CustomerTO[].class)
	@ApiResponses(value = {
	@ApiResponse(code = 404, message = "Not Found", response = CustomerNotFoundException.class),				
	@ApiResponse(code = 500, message = "Internal server erroe", response = InternalServerErrorException.class),				
@ApiResponse(code = 200, message = "success", response = CustomerTO[].class) })
	@RequestMapping(value = "/customer", produces = { "application/json;charset=utf-8" }, consumes = {
			"application/json;charset=utf-8" }, method = RequestMethod.GET)
	public CustomerTO[] readAllCustomer();






	

}



