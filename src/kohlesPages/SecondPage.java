package kohlesPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondPage {
	
	 WebDriver driver;

	public SecondPage(WebDriver driver)
	{
		this.driver=driver;
	}

	@FindBy(xpath="//*[@class=\"sbSelector\"]")
	List <WebElement> dropDown;
	
	@FindBy(xpath="//*[@role='listitem']")
	List<WebElement> dropDownList;
	
	@FindBy(xpath="//*[@class=\"products_grid yourPrice_eligible\"]")
	List<WebElement> images;
	
	
	public void sortBy() throws InterruptedException
	{
		Thread.sleep(2000l);
		dropDown.get(0).click();
		Thread.sleep(2000l);
				dropDownList.get(4).click();
			
	
	}
	public void selectDress() throws InterruptedException
	{
		 WebDriverWait wait=new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.elementToBeClickable(images.get(0)));
			Actions act = new Actions(driver);
			Action seri = act.moveToElement(images.get(0)).click().build();
			seri.perform();
//		images.get(0).click();
		
	}
	}
