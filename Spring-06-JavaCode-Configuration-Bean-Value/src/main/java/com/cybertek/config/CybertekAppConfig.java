package com.cybertek.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.cybertek.interfaces.ExtraSessions;
import com.cybertek.services.Java;
import com.cybertek.services.OfficeHours;

@Configuration
@ComponentScan("com.cybertek")
@PropertySource("classpath:application.properties")
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



