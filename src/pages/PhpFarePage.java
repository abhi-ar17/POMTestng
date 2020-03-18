package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PhpFarePage {
	WebDriver driver;
	public PhpFarePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By fare = By.xpath("//*[@class=\"theme-search-results-item-price-tag\"]//strong");
	
	public void selectMinimun()
	{
		String rate=driver.findElements(fare).get(0).getText();
		int rate_ = Integer.parseInt(rate.substring(4));
//		System.out.println(rate_);
		Assert.assertTrue(rate_>100&&rate_<250,"Not met the Requirements");
	}
	

}
