package com.cybertek.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cybertek.interfaces.ExtraSessions;
import com.cybertek.services.Java;
import com.cybertek.services.OfficeHours;

@Configuration
@ComponentScan("com.cybertek")
public class CybertekAppConfig {
	
	@Bean
	public Java java() {
		return new Java(extraSessions());
	}
	
	@Bean
	public ExtraSessions extraSessions() {
		return new OfficeHours();
	}


}



