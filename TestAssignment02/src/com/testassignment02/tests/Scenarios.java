package com.testassignment02.tests;



public class Scenarios {
	
	public void scenrio1()
	{
		
		TestScripts.launchApp("chrome");
		
		TestScripts.navigate();
		TestScripts.search();
		TestScripts.writeReview();
		TestScripts.HotelReview();
	TestScripts.closeApp();
		
		
	}
	
	
	
}
