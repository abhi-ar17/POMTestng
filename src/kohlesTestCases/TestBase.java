package kohlesTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.testng.annotations.BeforeTest;

public class TestBase {
	public static WebDriver driver;

	/*
	 * @BeforeTest public void beforeSuite() { System.setProperty(
	 * "webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe"
	 * ); driver=new ChromeDriver(); driver.get("https://www.kohls.com/ ");
	 * driver.manage().window().maximize(); }
	 * 
	 * @AfterTest public void afterSuite() { TestBase.driver.quit(); }
	 */


	  public void beforeSuite() { System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.kohls.com/");
	  driver.manage().window().maximize(); }
	 

}
