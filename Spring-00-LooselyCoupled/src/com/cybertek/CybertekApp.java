package com.cybertek;

import com.cybertek.services.FTMentor;
import com.cybertek.services.MentorImpl;

public class CybertekApp {

	public static void main(String[] args) {
		
		FTMentor fulltime = new FTMentor();
		
		MentorImpl mentor = new MentorImpl(fulltime);
		mentor.manageAccount();

	}

}
