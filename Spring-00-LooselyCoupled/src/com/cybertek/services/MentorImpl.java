package com.cybertek.services;

import com.cybertek.interfaces.Mentor;

public class MentorImpl {
	
	Mentor mentor;

	public MentorImpl(Mentor mentor) {
		this.mentor = mentor;
	}
	
	public void manageAccount() {
		this.mentor.createAccount();
	}
	
	

}
