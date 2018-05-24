package drivertest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

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

		/// implicit wait as soon as it is instantiated
		// for any element, wait 3 seconds before determining a fail
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// we can configure out driver's explicit wait as soon as it is instantiated
		// for a specific action, wait 4 seconds before determing a fail
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
