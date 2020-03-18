package royal.caribiean.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstPage {
	WebDriver driver;
	 public FirstPage(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(id="rciHeaderMenuItem-1")
	WebElement findACruise;
	
//	@FindBy(xpath="//*[@class='mat-button-wrapper']")
//	List <WebElement> ships;
//	
//	@FindBy(xpath="//*[@class='mat-button-toggle-label-content']")
//	List <WebElement> shipsList;
//	
	@FindBy(xpath="//a[@class='inlineHyperlink']")
	List <WebElement> whale;
	
	@FindBy(id="rciHeaderMenuItem-2")
	WebElement ships;
	
	@FindBy(xpath="//*[@class=\"gallery__thumb__glass\"]")
	List <WebElement> shipsList;
	
	public int checkWhaleWatching()
	{
		int flag=0;
		for(int i=0;i<whale.size();i++)
		{
			if(whale.get(i).getText().contains("whale"))
			{
//				System.out.println("]]]]]]]]"+whale.get(i).getText());
				flag=1;
				break;
			}
		}
		return flag;
		
	}
	public void findACruise_()
	{
		findACruise.click();

	}
	public void selectShip()
	{
ships.click();

		 WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.elementToBeClickable(shipsList.get(21)));
		shipsList.get(21).click();
	}
}
