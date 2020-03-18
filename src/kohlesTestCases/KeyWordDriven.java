package kohlesTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import kohlesPages.HomePage;
import kohlesPages.SecondPage;
import kohlesPages.ThirdPage;
//import testCases.ReadExcel;
public class KeyWordDriven extends TestBase{
  @Test(dataProvider="testdata")
  public void f(String data) throws InterruptedException {
	  TestBase cc = new TestBase();
	  HomePage firstPage = PageFactory.initElements(driver, HomePage.class);
	  SecondPage secondPage = PageFactory.initElements(driver, SecondPage.class);
	  ThirdPage thirdPage = PageFactory.initElements(driver, ThirdPage.class);
	  
	  if(data.equals("Open Browser"))
	  {
		  cc.beforeSuite();
	  }
	  else if(data.equals("Search"))
	  {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  firstPage.search("Tuxedo");
		  
	  }
	  else if(data.equals("Sort"))
	  {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  secondPage.sortBy();
	  }
	  else if(data.equals("Select Dress"))
	  {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  secondPage.selectDress();
	  }
	  else if(data.equals("Choose Size"))
	  {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  thirdPage.chooseSize();
	  }
	  else if(data.equals("Increase Quantity"))
	  {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  thirdPage.increaseQuantity();
	  }
	  else if(data.equals("Add To Cart"))
	  {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  thirdPage.addToCart();
	  }
	  else if(data.equals("Check Cart"))
	  {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 int as= thirdPage.checkCart();
		  Assert.assertTrue(as==2);
	  }
  }
  
  @DataProvider(name="testdata")
  public Object[][] getKeyword()
  {
	  ReadExcel config = new ReadExcel("C://Users//837366//Desktop//excel.xlsx");
	  int row = config.getRowCount(4);
	  int col=1;
	  Object[][] keyWord = new Object[row][col];
	  for(int i=0;i<row;i++)
	  {
		  for(int j=0;j<col;j++)
		  {
			  keyWord[i][j]=config.getData(4, i, j);
		  }
	  }
	  return keyWord;
  }
}
