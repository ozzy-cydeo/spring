package com.cybertek.services;

import org.springframework.stereotype.Component;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;


public class Java implements Course {
	
	private ExtraSessions extraSessions;
	
	

	public Java(ExtraSessions extraSessions) {
		super();
		this.extraSessions = extraSessions;
	}



	@Override
	public void getTeachingHours() {
		System.out.println("Weekly Teaching Hours: " + (20+extraSessions.getHours()));
	}

}
