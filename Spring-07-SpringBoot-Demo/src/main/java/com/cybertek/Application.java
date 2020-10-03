package com.cybertek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import com.cybertek.services.Java;
import com.cybertek.services.OfficeHours;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext container = SpringApplication.run(Application.class, args);
		
		Course course = container.getBean("java",Course.class);
		
		course.getTeachingHours();
		

	}

}



