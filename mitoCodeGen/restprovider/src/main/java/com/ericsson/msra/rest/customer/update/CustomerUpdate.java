package com.ericsson.msra.rest.customer.update;


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

 

@Api(value = "CustomerUpdate", tags = { "CustomerUpdate" })
@RestController

@RequestMapping(value = "api/v3/")
public interface CustomerUpdate {

	
		@ApiOperation(value = "update Customer Details", nickname = "updateCustomer")
	@ApiResponses(value = {
@ApiResponse(code = 204, message = "Updated") })
	@RequestMapping(value = "/customer/{id}", produces = { "application/json;charset=utf-8" }, consumes = {
			"application/json;charset=utf-8" }, method = RequestMethod.PUT)
	public  void updateCustomer(	@ApiParam(value = "", required = true) @PathVariable String id,	@ApiParam(value = "<<Provide a suitable documentnt here>>", required = true) @RequestBody @Valid CustomerTO customerTO);






	

}



