package drivertest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import driver.DriverFactory;

public class ChromeTest {
	WebDriver driver;

	@BeforeSuite
	public void beforeSuite() {
		driver = DriverFactory.get("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
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
