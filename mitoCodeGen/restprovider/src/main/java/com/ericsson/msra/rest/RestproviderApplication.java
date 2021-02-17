package com.ericsson.msra.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 
 */
@SpringBootApplication(scanBasePackages = "com.ericsson.msra.rest")
public class RestproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestproviderApplication.class, args);
	}

}
