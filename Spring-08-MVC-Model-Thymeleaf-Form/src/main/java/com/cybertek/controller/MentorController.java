package com.cybertek.controller;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cybertek.model.Mentor;

@Controller
@RequestMapping("/mentor")
public class MentorController {
	
	@GetMapping("/register")
	public String showForm(Model model) {
		
		//Mentor mentor = new Mentor();
		//model.addAttribute("mentor",mentor);
		
		
		model.addAttribute("mentor", new Mentor());
		
		
		List<String> batchList = new ArrayList<>();
        batchList.add("B7");
        batchList.add("B8");
        batchList.add("B9");
        batchList.add("B10");
        batchList.add("B11");
        batchList.add("B12");
        batchList.add("B13");
        batchList.add("B14");
        batchList.add("B15");
        batchList.add("B16");
        batchList.add("B17");

        model.addAttribute("batchList",batchList);
		
		
		
		return "/mentor/register-form";
		
	}
	
	@PostMapping("/confirm")
	public String submitForm( Mentor mentor) {
		
		System.out.println(mentor.toString());
		
		return "/mentor/register-confirmation";
		
	}
	
	/*
	@PostMapping("/confirm")
	public String submitForm(@ModelAttribute("mentor2") Mentor mentor) {
		
		System.out.println(mentor.toString());
		
		return "/mentor/register-confirmation";
		
	}
	*/
	

	
	
	


}
