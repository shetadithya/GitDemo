package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import drivers.DriverSetUp;
import io.cucumber.java.en.Then;
import pageObject.OfferPage;

public class OfferPageStep {
WebDriver driver;
public String landingPageName;
public String offerPageName;
public DriverSetUp driverSetup;

public OfferPageStep(DriverSetUp driverSetup)
{
	this.driverSetup=driverSetup;
}

	@Then("seched with {string} and store it")
	public void seched_with_and_store_it(String string) throws InterruptedException {
		switchToOfferPage();
		OfferPage offerPage= new OfferPage(driverSetup.driver);
		Thread.sleep(5000);
		offerPage.searchItem(string);
		
		
		offerPageName=	offerPage.getProductName();
	}
	
	public void switchToOfferPage()
	{
		driverSetup.driver.findElement(By.partialLinkText("Top Deals")).click();
		Set<String> windows=driverSetup.driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		driverSetup.driver.switchTo().window(childWindow);
	}
	@Then("both serches matches")
	public void both_serches_matches() {
		Assert.assertEquals(offerPageName, driverSetup.landingPageName);
	
	}
}
