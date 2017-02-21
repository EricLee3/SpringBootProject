package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	/*
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/mv") // http://localhost/mv
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);

		return "a";
	}
	*/
}
