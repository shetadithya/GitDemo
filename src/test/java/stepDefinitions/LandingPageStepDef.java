package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import drivers.DriverSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LandingPage;

public class LandingPageStepDef {
public WebDriver driver;
public String landingPageName;
DriverSetUp driverSetup;

public LandingPageStepDef(DriverSetUp driverSetup)
{
	this.driverSetup=driverSetup;
}

	@Given("user is on greenkart landing page")
	public void user_is_on_greenkart_landing_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driverSetup.driver = new ChromeDriver();
		driverSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	  
	}
	@When("searched with {string} and store it")
	public void searched_with_and_store_it(String string) throws InterruptedException {
		LandingPage landingPage=new LandingPage(driverSetup.driver);
		landingPage.searchItem(string);
		Thread.sleep(3000);
		driverSetup.landingPageName=landingPage.getProductName().split("-")[0].trim();
	}
	
}
