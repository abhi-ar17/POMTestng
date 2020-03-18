package com.phpTravels.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.phpTravels.page.firstPage;



public class TestMain {
	WebDriver driver;
//	firstPage fp = PageFactory.initElements(driver, firstPage.class);
	@BeforeSuite
	public void beforeSuite()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://phptravels.com/demo");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{	
		firstPage fp = PageFactory.initElements(driver, firstPage.class);
		int count=fp.findLink();
//		Assert.assertTrue(count<100, "There have more than 100 links");
		Assert.assertTrue(count>100,"There doesn't have more than 100 links");
		int fb=fp.fb();
		int gP=fp.googlePlus();
		int t=fp.twitter();
		Assert.assertTrue(fb==1&&gP==1&&t==1,"Three social media links are not present");
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}

}
