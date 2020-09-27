package com.cybertek.services;

import com.cybertek.interfaces.Mentor;

public class FTMentor implements Mentor {

	@Override
	public void createAccount() {
		System.out.println("FT Mentor Account is created...");
	}

}
