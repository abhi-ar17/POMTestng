package com.bmw.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SecondPage {
WebDriver driver;
	public SecondPage(WebDriver driver)							//Constructor
	{
		this.driver=driver;
	}

//	**********************************************ALL LOCATORS***************************************
	
	
	@FindBy(xpath="//*[@class=\"button ds2-link expand ds2-dropdown-js-area\"]")
	WebElement dropDown;
	
	@FindBy(xpath="//*[@class=\"ds2-dropdown__link ds2-link\"]")
	List <WebElement> dropDownList;
	
	@FindBy(xpath="//*[@class=\"content ds2-technical-data--content ds2-mvc-tabs-content__panel ds2-mvc-tabs-content__panel--active\"]//div[@class=\"ds2-cms-output\"]")
	List <WebElement> data;
	
	public void getData(int n)
	{
		dropDown.click();																										//Clicking on drop down 
		dropDownList.get(n).click();																						//sELECTING car
		String dat = data.get(35).getText();																			//Getting power value
		Integer as = Integer.parseInt(dat.substring(5,8));													//Converting to integer
//		System.out.println(as);
	    Assert.assertTrue(as>500,"Does not meet my requirements");									//Assert on the condition given
	}
	
}
