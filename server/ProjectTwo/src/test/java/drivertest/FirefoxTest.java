package drivertest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import driver.DriverFactory;

public class FirefoxTest {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeSuite
	public void beforeSuite() {
		driver = DriverFactory.get("firefox");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 4);
	}
	
	@Test(priority=1)
	public void home() {
		driver.get("https://dev-caliber.revature.tech/caliber/#/trainer/home");
		assertEquals(driver.getTitle(), "Caliber | Performance Management");
	}

	@AfterSuite
	public void afterSuite() {
		driver.close();
	}

}
