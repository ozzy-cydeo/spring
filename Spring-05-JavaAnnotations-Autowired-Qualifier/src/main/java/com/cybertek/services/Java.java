package com.cybertek.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;

@Component
public class Java implements Course {
	
	
	/*
	@Autowired
	@Qualifier("mentorHours")
	private ExtraSessions extraSessions;
	*/

	@Override
	public void getTeachingHours() {
		System.out.println("Weekly Teaching Hours: " + (20 + extraSessions.getHours()));
	}


	
	
	//constructor injection
	
	
	
	private ExtraSessions extraSessions;
	
	public Java(@Qualifier("mentorHours") ExtraSessions extraSessions) {
		this.extraSessions = extraSessions;
	}
	
	

}




