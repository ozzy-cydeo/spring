package com.cybertek.services;

import com.cybertek.interfaces.Mentor;

public class PTMentor implements Mentor {
	
	@Override
	public void createAccount() {
		System.out.println("PT Mentor Account is created...");
	}

}
