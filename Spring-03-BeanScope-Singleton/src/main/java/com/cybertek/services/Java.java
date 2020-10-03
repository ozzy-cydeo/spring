package com.cybertek.services;

import com.cybertek.interfaces.Course;

public class Java implements Course {
	
	private OfficeHours javaOfficeHours;
	
	@Override
	public void getTeachingHours() {
		System.out.println("Weekly Teaching Hours: " + (20 + javaOfficeHours.getHours()));
	}

	public OfficeHours getJavaOfficeHours() {
		return javaOfficeHours;
	}

	public void setJavaOfficeHours(OfficeHours javaOfficeHours) {
		this.javaOfficeHours = javaOfficeHours;
	}
	
	


	
	

}
