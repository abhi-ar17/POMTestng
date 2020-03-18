package royal.caribiean.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;

public class TestBase {
	public static WebDriver driver;

	
	  @BeforeSuite public void beforeSuite() {
	 System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	 		driver=new ChromeDriver(); 
	 driver.get("https://www.royalcaribbean.com/alaska-cruises ");
	 driver.manage().window().maximize(); }
	 
//	 @AfterSuite public void afterSuite() { TestBase.driver.quit(); }


}
