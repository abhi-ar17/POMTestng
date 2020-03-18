package pages;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhpHomePage {
	WebDriver driver;
	public PhpHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By dropdown = By.xpath("//*[@class=\"btn btn-text-inherit btn-interactive\"]");
	By currency_ = By.xpath("//*[@class=\"dropdown-item text-center\"]");
	By flight = By.xpath("//*[@data-name=\"flights\"]");
	By fromLoc = By.xpath("//*[@id=\"s2id_location_from\"]");
	By fromToLocation = By.xpath("//*[@id=\"select2-drop\"]//div//input");
	By fromToLocationList = By.xpath("//*[@class='select2-result-label']");
	By fromToLocationSelect= By.xpath("//*[@class=\"select2-results-dept-0 select2-result select2-result-selectable\"]");
	By toLoc = By.xpath("//*[@id=\"s2id_location_to\"]");
	By dateClick = By.id("FlightsDateStart");
	By date = By.xpath("//*[@class='datepicker--cell datepicker--cell-day']");
	By search = By.xpath("//button[@class='btn-primary btn btn-block']");
	By next = By.xpath("//*[@id=\"datepickers-container\"]/div[8]/nav/div[3]");
	public void selectCurrency(String value) throws InterruptedException
	{
	
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElements(dropdown).get(0).click();
		 List <WebElement> currency = driver.findElements(currency_);
		 for(int i=0;i<currency.size();i++)
		 {
			 if(currency.get(i).getText().equalsIgnoreCase(value))
			 {
				 currency.get(i).click();
				break;
			 }
		 }
	}
	public void clickFlight() throws InterruptedException
	{
		Thread.sleep(3000l);
		driver.findElement(flight).click();
	}
	public void fromLoca(String fromLocation,String stop)
	{

	 driver.findElement(fromLoc).click();

		 driver.findElement(fromToLocation).sendKeys(fromLocation);
		
		
		 List <WebElement> loc = driver.findElements(fromToLocationList);
		 for(int i=0;i<loc.size();i++)
		 {
//			 System.out.println(loc.get(i).getText());
			 if(loc.get(i).getText().contains(stop))
			 {
				 driver.findElements(fromToLocationSelect).get(i-1).click();
				 break;
			 }
		 
	}
	

	}
	
	public void ToLoca(String toLocation,String stop_)
	{

		 driver.findElement(toLoc).click();

		 driver.findElement(fromToLocation).sendKeys(toLocation);
	

		 List <WebElement> loc = driver.findElements(fromToLocationList);
		 for(int i=0;i<loc.size();i++)
		 {
//			 System.out.println(loc.get(i).getText());
	
			 if(loc.get(i).getText().contains(stop_))
			 {
	
				 driver.findElements(fromToLocationSelect).get(i-1).click();
				 break;
			 }
		 }
	}
	
	public void datePick()
	{

		 driver.findElement(dateClick).click();

		  Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		 Integer day = calendar.get(Calendar.DATE)+5;
//		  Integer day=28+5;
	Integer year = calendar.get(Calendar.YEAR);
	Integer month=calendar.get(Calendar.MONTH);
	System.out.println("month :" +month);
	if(month==0||month==2||month==4||month==6||month==7||month==9||month==11)
	{
		System.out.println("....................................");
		if(day>31)
		{
			System.out.println("March day 33"+day);
			driver.findElement(next).click();
		day=day-31;
		} 
		
		List <WebElement> dates = driver.findElements(date);
		 for(int i=0;i<dates.size();i++)
		 {
			 if(dates.get(i).getText().equalsIgnoreCase(day.toString()))
			 {
				 dates.get(i).click();
				 break;
			 }
		 }
	}
	
	else if(month==3||month==5||month==8||month==10)
	{
		
		if(day>30)
		{
			driver.findElements(next).get(1).click();
		day=day-30;
		} 
		List <WebElement> dates = driver.findElements(date);
		 for(int i=0;i<dates.size();i++)
		 {
			 if(dates.get(i).getText().equalsIgnoreCase(day.toString()))
			 {
				 dates.get(i).click();
				 break;
			 }
		 }
	}
	
	else if(month==1)
	{
		if(year%4==0)
		{
			if(day>29)
			{
				driver.findElements(next).get(1).click();
				day=day-29;
			}
		}
		else
		{
			if(day>28)
			{
				driver.findElements(next).get(1).click();
				day=day-28;
			}
		}
		List <WebElement> dates = driver.findElements(date);
		 for(int i=0;i<dates.size();i++)
		 {
			 if(dates.get(i).getText().equalsIgnoreCase(day.toString()))
			 {
				 dates.get(i).click();
				 break;
			 }
		 }
	}
	
	}
	public void click()
	{
		driver.findElement(search).click();
	}
	

}
