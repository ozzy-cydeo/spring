package com.cybertek.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
	
	
    //init method
    @PostConstruct
    public void postConstruct() {

        System.out.println("Executing post construct");
    }

    //destroy method
    @PreDestroy
    public void preConstruct() {
    	System.out.println("Executing pre construct");
    }

}
