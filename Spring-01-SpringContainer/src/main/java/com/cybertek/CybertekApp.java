package com.cybertek;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cybertek.interfaces.Mentor;

public class CybertekApp {

	public static void main(String[] args) {
			
		//Creating container with Application Context
		//ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
		
		
		//Creating container with Application Context
		BeanFactory container = new ClassPathXmlApplicationContext("config.xml");
		
		
		
		//Mentor mentor = container.getBean("fullTimeMentor",Mentor.class);
		Mentor mentor = (Mentor) container.getBean("partTimeMentor");
		
		
		
		mentor.createAccount();
	}

}
