package com.cybertek.services;

import org.springframework.stereotype.Component;

import com.cybertek.interfaces.ExtraSessions;

@Component
public class MentorHours implements ExtraSessions {

	@Override
	public int getHours() {
		return 3;
	}

}
