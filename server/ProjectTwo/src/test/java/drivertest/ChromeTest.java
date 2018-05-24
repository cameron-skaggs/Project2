package drivertest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import driver.DriverFactory;

public class ChromeTest {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeSuite
	public void beforeSuite() {
		driver = DriverFactory.get("chrome");
		wait = new WebDriverWait(driver, 4);
	}
	
	@Test
	public void home() {
		driver.get("https://dev-caliber.revature.tech/caliber/#/trainer/home");
		assertEquals(driver.getTitle(), "Caliber | Performance Management");
	}

	@AfterSuite
	public void afterSuite() {
		driver.close();
	}

}
