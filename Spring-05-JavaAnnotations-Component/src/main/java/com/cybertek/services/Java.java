package com.cybertek.services;

import org.springframework.stereotype.Component;

import com.cybertek.interfaces.Course;

@Component
public class Java implements Course {

	@Override
	public void getTeachingHours() {
		System.out.println("Weekly Teaching Hours: 20");
	}

}




