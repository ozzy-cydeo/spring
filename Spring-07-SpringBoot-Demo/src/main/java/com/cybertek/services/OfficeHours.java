package com.cybertek.services;

import org.springframework.stereotype.Component;

import com.cybertek.interfaces.ExtraSessions;

@Component
public class OfficeHours implements ExtraSessions {

	@Override
	public int getHours() {
		return 5;
		
	}

}
