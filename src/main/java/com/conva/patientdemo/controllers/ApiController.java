package com.conva.patientdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiController {

	@RequestMapping("/call-api")
	private String callapi() {
		
		String url = "https://jsonplaceholder.typicode.com/users";
		RestTemplate restTemplate = new RestTemplate();			
		String result = restTemplate.getForObject(url, String.class);
		return result;
	}

}
