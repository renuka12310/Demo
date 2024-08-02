package com.example.Restcontroller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Payment {
	
	@PostMapping("/add")
	public String addPayment()
	{
		
		return "null";	
	}

}
