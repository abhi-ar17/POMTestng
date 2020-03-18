package com.phpTravels.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;





public class firstPage {
	WebDriver driver;
	
	public firstPage(WebDriver driver)
	{
		this.driver=driver;
	}

	@FindBy(xpath="//a")
	List <WebElement> links;
	
	public int findLink()
	{
		int count=links.size();
//		Assert.assertTrue(count<100, "There have more than 100 links");

		return count;
	}
	public int fb()
	{
		int fb=0;
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).getAttribute("href").contains("facebook"))
			{
				System.out.println(links.get(i).getAttribute("href")+"............"+i);
				 fb=1;
				break;
			}
		}
		System.out.println(fb);
		return fb;
	}
	
	public int googlePlus()
	{
		int gP=0;
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).getAttribute("href").contains("plus.google"))
			{
				System.out.println(links.get(i).getAttribute("href")+".........."+i);
				 gP=1;
				break;
			}
		}
		System.out.println(gP);
		return gP;
	}
	
	public int twitter()
	{
		int t=0;
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).getAttribute("href").contains("twitter"))
			{
				System.out.println(links.get(i).getAttribute("href")+"........"+i);
				t=1;
				break;
			}
		}
		System.out.println(t);
		return t;
	}
}
