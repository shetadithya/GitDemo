package pageObject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {

	WebDriver driver;
	public OfferPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	 By search=By.id("search-field");
	 By product= By.xpath("//tr/td[1]");
	 
	 public void searchItem(String name)
	 {
		 driver.findElement(search).sendKeys(name);
		 
	 }
	
	 public String getProductName()
	 {
		return driver.findElement(product).getText();
	 }
}

