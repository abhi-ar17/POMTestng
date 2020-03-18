package com.beCognizant.first.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		 System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		 		driver=new ChromeDriver(); 
		 driver.get("https://be.cognizant.com");
		 driver.manage().window().maximize(); }
		 

}
