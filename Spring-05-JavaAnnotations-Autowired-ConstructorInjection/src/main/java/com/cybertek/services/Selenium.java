package com.cybertek.services;

import org.springframework.stereotype.Component;

import com.cybertek.interfaces.Course;

@Component
public class Selenium implements Course {

	@Override
	public void getTeachingHours() {
		System.out.println("Weekly Teaching Hours - 10");
	}
		
}
