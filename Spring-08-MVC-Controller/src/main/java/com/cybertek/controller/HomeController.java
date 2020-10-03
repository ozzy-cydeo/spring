package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping()
	public String requestMappingEx() {
		return "home";
		
	}
	
	@RequestMapping("/home")
	public String requestMappingEx1() {
		return "home";
		
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="/home2") //Method parameter accept all http methods including (GET, POST, PUT, DELETE)
	public String requestMappingWithMethodEx() {
		return "home";
	}
	
	@GetMapping("/index")
	public String getMappingEx() {
		return "home";
		
	}
	
	@PostMapping("/index")
	public String postMapping() {
		return "home";
	}
	
	
	@GetMapping("/home/{name}")                                           //http://localhost:8080/home/cybertek
	public String pathVariableEx(@PathVariable("name") String name) {
		System.out.println("name is :" + name);                           //name is cybertek
		return "home";
	}
	

	@GetMapping(value="/home/{name}/{email}")
	public String pathVariableEx2(@PathVariable String name,@PathVariable String email) {
		System.out.println(name + "|" + email);
		return "home";
	}
	
    @GetMapping(value = "/home/course")
    public String requestParamEx(@RequestParam("course") String course) {
        System.out.println("name is: " + course);
        return "home";
    }
	
    @GetMapping(value = "/course")
    public String requestParamEx2(@RequestParam(value = "name", required = false, defaultValue = "CyberTek") String name) { //If query  parameter is not present, default value will present as value, "CyberTek" in our case.
        System.out.println("name is: " + name);
        return "home";
    }
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
