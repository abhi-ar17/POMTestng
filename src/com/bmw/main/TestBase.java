package com.bmw.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bmw.pages.FirstPage;
import com.bmw.pages.SecondPage;


public class TestBase {
	WebDriver driver ;
	SecondPage sp;
	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");     //Initializing WebDriver  
	 driver = new ChromeDriver();
		driver.get("https://www.bmw.in/en/");																													//Loading the web site
		driver.manage().window().maximize();																													//Maximizing browser window
	}
	
	@Test
	public void f()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		FirstPage fp = PageFactory.initElements(driver, FirstPage.class);								//creating object for FirstPage class
		fp.clickModels();																										//Calling function click models on FirstPage class
		fp.clickTechData();																									//Calling function clickTechData on FirstPage class
	}
	
	@Test(dependsOnMethods= {"f"})
	public void g()
	{
		sp=PageFactory.initElements(driver,SecondPage.class);											//creating object for SecondPage class
	    sp.getData(0);																											//Calling function getData on SecondPage class for the first car
	}
	
	@Test(dependsOnMethods= {"f"})
	public void h()
	{
		sp.getData(1);																											//Calling function getData on SecondPage class for the second car
	}
	
	@Test(dependsOnMethods= {"f"})
	public void i()
	{
		sp.getData(2);																											//Calling function getData on SecondPage class for the third car
	}
	
	@Test(dependsOnMethods= {"f"})
	public void j()
	{
		sp.getData(3);																											//Calling function getData on SecondPage class for the fourth car
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();																											  //Quitting the browser
	}

}
