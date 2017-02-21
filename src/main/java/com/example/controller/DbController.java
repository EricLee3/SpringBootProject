package com.example.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.service.DbService;
 
@RestController
public class DbController {
    @Autowired
    DbService dbService;
     
    @RequestMapping("/")
    public @ResponseBody String root_test() throws Exception{  
        return "Hello World";
    }
 
    @RequestMapping("/now")
    public @ResponseBody String now() throws Exception{
        return dbService.getDual();
    }
    
	@RequestMapping("/hello")
	public String hello(Model model) throws Exception  {
		model.addAttribute("name", "SpringBlog from XXX");
		return "helloaaaaa";
	}
}


