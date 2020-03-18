package testCases;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.PhpFarePage;
import pages.PhpHomePage;

public class HomePage extends TestBase{

  @Test
  public void f() throws  Exception  {
	  PhpHomePage firstPage = PageFactory.initElements(TestBase.driver,PhpHomePage.class);
	  PhpFarePage secondPage =  PageFactory.initElements(TestBase.driver,PhpFarePage.class);

	  firstPage.selectCurrency("EUR");
		 Thread.sleep(2000l);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	  firstPage.clickFlight();
	  firstPage.fromLoca("Los Angeles","(LAX)");

	  firstPage.ToLoca("Dallas","(DFW)");



	  firstPage.datePick();


	  firstPage.click();
	  
	  secondPage.selectMinimun();

}
}
