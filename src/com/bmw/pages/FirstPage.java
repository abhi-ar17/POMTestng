package com.bmw.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstPage {
WebDriver driver;
	public FirstPage(WebDriver driver)											//Constructor
	{
		this.driver=driver;
	}
	
//	**********************************************ALL LOCATORS***************************************

	
	By models = By.xpath("//*[@class='tw-cursor-pointer']");

	By seri=By.xpath("//*[@class='tw-cursor-pointer tab-scroll-header-item tw-z-10 tab-bar-animation']/a");
	
	@FindBy(xpath="//*[@class='cosy-image-wrapper tw-relative']")
	WebElement image;
	
	@FindBy(xpath="//a[@class='tw-font-bmw-bold tw-text-450 tw-no-underline tw-m-0 focus:tw-text-grey-500 tw-text-grey-500']")
	List <WebElement> techData;
	
	public void clickModels()
	{
		driver.findElement(models).click();   // Clicking on models button
		List <WebElement> series = driver.findElements(seri);
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable((series.get(0))));
		for(int i=0;i<series.size();i++)
		{
//			System.out.println(series.get(i).getText());
			if(series.get(i).getText().equals("7"))					// Check for the button 7
			{
				series.get(i).click();   				// Clicking on option 7
				break;
			}
		}
		Actions act = new Actions(driver);                              //Clicking on image after moving to the element
		act.moveToElement(image).click().perform();
	}
	public void clickTechData()
	{
		techData.get(1).click();													//Clicking on Technical data
	}
	
}
