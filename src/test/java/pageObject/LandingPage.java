package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	//testing    java
	
	 By search=By.className("search-keyword");
	 By product= By.className("product-name");
	 
	 public void searchItem(String name)
	 {
		 driver.findElement(search).sendKeys(name);
		 
	 }
	
	 public String getProductName()
	 {
		return driver.findElement(product).getText();
	 }
}
