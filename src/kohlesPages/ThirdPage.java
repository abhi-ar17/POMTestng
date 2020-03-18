package kohlesPages;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ThirdPage {
	
	 WebDriver driver;

	public ThirdPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[@class='pdp-product-increase pdp-qtty pdp-qtty-boss-increase']")
	WebElement quantity;
	
	@FindBy(id="addtobagID")
	List <WebElement> addTo;
	
	@FindBy(id="size-dropdown")
	WebElement sizeDropDown;
	
	@FindBy(xpath="//*[@class=\"number-items boss-number-items nonzero-items\"]")
	WebElement cartNumber;
	
	public void chooseSize()
	{
		 WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.elementToBeClickable(sizeDropDown));

		Select s = new Select(sizeDropDown);
		s.selectByVisibleText("44L 37");
		
		
	}
	public void increaseQuantity()
	{
		 WebDriverWait wait=new WebDriverWait(driver,40);
		 wait.until(ExpectedConditions.elementToBeClickable(quantity));

		quantity.click();
	}
	
	public void addToCart()
	{
		addTo.get(0).click();
	}
	
	public int checkCart()
	{
		String cartNo = cartNumber.getText();
		Integer as = Integer.parseInt(cartNo);
		return as;
	}

}
