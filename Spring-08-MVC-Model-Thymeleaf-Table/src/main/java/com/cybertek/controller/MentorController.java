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
	

	
	@GetMapping("/list")
	public String submitForm(Model model) {
		
		List<Mentor> mentorList = new ArrayList<Mentor>();
		mentorList.add(new Mentor("Ozzy", "Can", 30));
		mentorList.add(new Mentor("Mike", "Smith", 35));
		mentorList.add(new Mentor("Tom", "Bryan", 20));
		
		model.addAttribute("mentorList",mentorList);
		
		return "/mentor/mentor-list";
		
	}
	


	
	
	


}
