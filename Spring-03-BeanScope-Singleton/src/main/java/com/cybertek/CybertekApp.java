package com.cybertek;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cybertek.interfaces.Course;
import com.cybertek.services.Java;
import com.cybertek.services.OfficeHours;

public class CybertekApp {

	public static void main(String[] args) {
		
		

		ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
		
		Course course1 = (Course) container.getBean("java");
		
		Course course2 = (Course) container.getBean("java");
		
		
		System.out.println("Pointing to the same object: " + (course1 == course2));
		
		System.out.println("Memory Location for the course1: " + course1);
		
		System.out.println("Memory Location for the course1: " + course1);
		
		
		
		
	
		
	}

}
