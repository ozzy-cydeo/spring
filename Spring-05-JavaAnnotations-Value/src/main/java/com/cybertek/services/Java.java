package com.cybertek.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;

@Component
@Scope("prototype")
public class Java implements Course {
	
	
	@Value("J1")
	private String batch;
	
	
	@Value("${instructor}")
	private String instructor;
	
	
	@Value("${days}")
	private String[] days;
	
	
	@Autowired
	private ExtraSessions extraSessions;
	

	@Override
	public void getTeachingHours() {
		System.out.println("Weekly Teaching Hours: " + (20 + extraSessions.getHours()));
	}


	@Override
	public String toString() {
		return "Java [batch=" + batch + ", instructor=" + instructor + ", days=" + Arrays.toString(days)
				+ ", extraSessions=" + extraSessions + "]";
	}
	
	

}




