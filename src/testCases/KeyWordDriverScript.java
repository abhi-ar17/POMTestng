package testCases;

import org.testng.annotations.Test;

import pages.PhpFarePage;
import pages.PhpHomePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class KeyWordDriverScript extends TestBase {

  @Test(dataProvider="testdata")
  public void f(String data) throws InterruptedException {
	  
	  TestBase cc = new TestBase();
	  PhpHomePage dd = PageFactory.initElements(TestBase.driver,PhpHomePage.class);
	  PhpFarePage ee =  PageFactory.initElements(TestBase.driver,PhpFarePage.class);
	  
	  if(data.equals("Open Browser"))
	  {
		  
		  cc.beforeSuite();
	  }
	  else if(data.equals("Select Currency"))
	  {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  System.out.println("........................");
		  dd.selectCurrency("EUR");
	  }
	  else if(data.equals("Click Flight"))
	  {
//		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  dd.clickFlight();
	  }
	  else if(data.equals("From Location"))
	  {
//		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  dd.fromLoca("Los Angeles", "(LAX)");
	  }
	  else if(data.equals("To Location"))
	  {
//		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  dd.ToLoca("Dallas", "(DFW)");
	  }
	  else if(data.equals("Pick Date"))
	  {
//		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  dd.datePick();
	  }
	  else if(data.equals("Search"))
	  {
//		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  dd.click();
	  }
	  else if(data.equals("Select Minimum"))
	  {
//		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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

