package royal.caribiean.main;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


import royal.caribiean.pages.FirstPage;
import royal.caribiean.pages.SecondPage;

public class HomePage extends TestBase{
//WebDriver driver;
	@Test
	public void f() throws InterruptedException
	{
		SecondPage sp = PageFactory.initElements(driver, SecondPage.class);
		FirstPage fp = PageFactory.initElements(driver, FirstPage.class);
		int abc = fp.checkWhaleWatching();
		fp.findACruise_();
		fp.selectShip();
		sp.deckPlans_();
		Thread.sleep(2000l);
		sp.selectDeck();
		int royal=sp.presenceOfRoyalSuite();
		
		Assert.assertTrue(abc==1&&royal==1,"Whale atching link and Royal suite is present");
	}
}
