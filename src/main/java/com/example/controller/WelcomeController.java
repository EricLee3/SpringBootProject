package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import java.util.Map;

 
@Controller
public class WelcomeController {
	
	@Value("${welcome.message:test}")
	private String message = "Hello World";
	
	@RequestMapping("/mv")                // http://localhost/mv
    public String welcome(Map<String,Object> model) {
	 	model.put("message",  this.message);
	 	
        return "a";                                     
    }
}


