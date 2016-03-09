package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/hello")
	public String sayHello(){
		return "hello";
	}
	
}
