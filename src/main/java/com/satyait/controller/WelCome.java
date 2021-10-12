package com.satyait.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelCome {
	
	@GetMapping("/show")
	public String show() {
		return "WELCOME TO WILKEF-CLASSES";
	}

	@GetMapping("/getData")
	public String getData(){
		return "get All Data";
	}

}
