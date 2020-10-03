package com.cybertek.services;

import com.cybertek.interfaces.Course;

public class Java implements Course {
	
	private OfficeHours officeHours;
	
	public Java(OfficeHours officeHours) {
		this.officeHours = officeHours;
	}

	@Override
	public void getTeachingHours() {
		System.out.println("Weekly Teaching Hours: " + (20 + officeHours.getHours()));
	}
	
	private void myDestroyMethod() {
		System.out.println("Executing my destroy method");
	}

}
