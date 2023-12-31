package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetapi/v1")
public class HomeController {

	@GetMapping("/hello")
	@ResponseBody
	public String greetMessage() {
		return "Hello World!"; 
	}
	
	@GetMapping("/helloName")
	@ResponseBody
	public String greetMessageWithName(@RequestParam(name = "fName") String name) {
		return "Hello "+name;
	}
}
