package royal.caribiean.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SecondPage {
	WebDriver driver;
	 public SecondPage(WebDriver driver) {
		this.driver=driver;
	}

	 @FindBy(xpath="//*[@class=\"font-block text-white size-25rem tablet-2rem mobile-25rem\"]")
	List <WebElement> deckPlans;
	 
 @FindBy(xpath="//*[@class=\"deck-plan__stateroom__subtype__name\"]")
List <WebElement> suites;

	 By deckDropDown = By.id("deckDropdown");
	 
	 public void deckPlans_()
	 {
		 for(int i=0;i<deckPlans.size();i++)
		 {
			 if(deckPlans.get(i).getText().contains("DECK PLANS"))
			 {
				 deckPlans.get(i).click();
				 break;
			 }
		 }
	 }
	 public  void selectDeck()
	 {
		 Select s=new Select(driver.findElement(deckDropDown));
		 s.selectByVisibleText("Deck Eight");
	 }
	 public int presenceOfRoyalSuite()
	 {
		 int flag=0;
		 for(int i=0;i<suites.size();i++)
		 {
			 if(suites.get(i).getText().contains("Royal Suite"))
			 {
				 System.out.println(".........."+suites.get(i).getText());
				 flag=1;
			 }
		 }
		 return flag;
	 }
	 
	 
}
