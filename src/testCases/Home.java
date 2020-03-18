package testCases;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.PhpFarePage;
import pages.PhpHomePage;

public class Home extends TestBase {
	WebDriver driver;
	@Test(dataProvider="testdata")
	public void f(String data) throws InterruptedException
	{
	TestBase cc = new TestBase();
	 PhpHomePage dd =  new PhpHomePage(driver);
     PhpFarePage ee = new PhpFarePage(driver);

	  if(data.equals("Open Browser"))
	  {
cc.beforeSuite();

	  }
	  else if(data.equals("Select Currency"))
	  {
		  dd.selectCurrency("EUR");
			 Thread.sleep(2000l);
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	  else if(data.equals("Click Flight"))
	  {
		  dd.clickFlight();
		  dd.fromLoca("Los Angeles","(LAX)");
	  
	try {
		  dd.ToLoca("Dallas","(DFW)");

	}
	catch (Exception e)
	{}
	try {
		  dd.datePick();
	}
	catch (Exception e)
	{}
	  }
	  else if(data.equals("From Location"))
	  {
		  dd.fromLoca("Los Angeles", "(LAX)");
	  }
	  else if(data.equals("To Location"))
	  {
		  dd.ToLoca("Dallas", "(DFW)");
	  }
	  else if(data.equals("Pick Date"))
	  {
		  dd.datePick();
	  }
	  else if(data.equals("Search"))
	  {
		  dd.click();
	  }
	  else if(data.equals("Select Minimum"))
	  {
		  ee.selectMinimun();
	  }

 }
 @DataProvider(name="testdata")
 
	  public Object[][]  readData()
	  {
	  ReadExcel config = new ReadExcel("C:\\Users\\837366\\Desktop\\excel.xlsx");
	  int row=config.getRowCount(1);
	  int col=1;
	  Object[][] keyword = new Object[row][col];
	  for(int i=0;i<row;i++)
	  {
		  for(int j=0;j<col;j++)
		  {
			  keyword[i][j]=config.getData(1, i, j);
		  }
	  }
	  return keyword;
 }
}


