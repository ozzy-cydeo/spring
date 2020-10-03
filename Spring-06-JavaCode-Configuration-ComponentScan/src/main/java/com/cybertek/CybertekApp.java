package com.cybertek;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cybertek.config.CybertekAppConfig;
import com.cybertek.interfaces.Course;
import com.cybertek.services.Java;
import com.cybertek.services.OfficeHours;

public class CybertekApp {

	public static void main(String[] args) {
			

		AnnotationConfigApplicationContext container = 
				new AnnotationConfigApplicationContext(CybertekAppConfig.class);
		

		Course course = (Course) container.getBean("java");
		
		
		course.getTeachingHours();;
		

		
		
		
	}

}
