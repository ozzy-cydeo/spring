package com.cybertek.services;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;


public class Java implements Course {
	
	@Value("J1")
	private String batch;
	
	
	@Value("${instructor}")
	private String instructor;
	
	
	@Value("${days}")
	private String[] days;
	
	
	private ExtraSessions extraSessions;
	
	

	public Java(ExtraSessions extraSessions) {
		super();
		this.extraSessions = extraSessions;
	}


	@Override
	public void getTeachingHours() {
		System.out.println("Weekly Teaching Hours: " + (20+extraSessions.getHours()));
	}


	@Override
	public String toString() {
		return "Java [batch=" + batch + ", instructor=" + instructor + ", days=" + Arrays.toString(days)
				+ ", extraSessions=" + extraSessions + "]";
	}
	
	

}
