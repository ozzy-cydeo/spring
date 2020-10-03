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

		Course course = (Course) container.getBean("java");
		
		course  =(Course) container.getBean("selenium");
		
		course.getTeachingHours();;
		
		
		
		
	}

}
