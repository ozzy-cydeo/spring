package com.cybertek.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/welcome")
	public String homePage(Model model) {
		
		model.addAttribute("name","Mike");


        int studentId = new Random().nextInt(1000);
        model.addAttribute("id",studentId);

        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        model.addAttribute("numbers",numbers);
        
        
        LocalDate birthday = LocalDate.of(1990, 10, 12);
        model.addAttribute("birthday",birthday);
        
		List<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("Selenium");
		courses.add("Agile");
		courses.add("API");
		
		model.addAttribute("courses",courses);
        
        
        return "/student/welcome";
        
	}
	
	
	@GetMapping("/welcome2")
	public String homePage2(Model model) {
		
		return "/student/welcome2";
		
	}
	
	
	


}
