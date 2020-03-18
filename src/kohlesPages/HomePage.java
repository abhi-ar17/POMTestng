package kohlesPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(id="search")
	WebElement search;
	
	public void search(String data)
	{
		search.sendKeys(data);
		search.sendKeys(Keys.RETURN);
	}

}
