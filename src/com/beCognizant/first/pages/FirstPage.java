package com.beCognizant.first.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage {

	 WebDriver driver;

	public FirstPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(id="i0116")
	WebElement email;
	
	@FindBy(id="320123")
	WebElement about;
	
	public void logIn()
	{
		email.sendKeys("837366@cognizant.com");
		email.sendKeys(Keys.RETURN);
	}
	
	public void clickAbout()
	{
		about.click();
	}
	
}
