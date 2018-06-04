package testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
import driver.DriverFactory;
import pom.HomePom;

public class HomeClass {
	WebDriver driver;
	HomePom home;
	
	@BeforeClass
	public void beforeSuite() {
		driver = DriverFactory.get("chrome");
	}
	
	@Test(priority=1)
	public void goHome() {
		home = new HomePom(driver);
		assertEquals("Caliber | Performance Management", home.title());
	}
	
	@Test(priority=2, dataProvider="navbar")
	public void clickNavbar(String string) {
		home.listNavbar(string);
	}
	
	@Test(priority=3, dataProvider="settings")
	public void clickSettings(String settings, String item) {
		home.listNavbar(settings);
		home.listSettings(item);
	}
	
	public String elementTrim(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		String string = element.getText();
		return string.replace(" ", "");
	}
	
	@AfterClass
	public void afterSuite() {
		driver.quit();
	}
	
	@DataProvider(name="navbar")
	public Object[][] navbar(){
		return new Object[][] {
			new Object[] { "Home" },
			new Object[] { "Manage Batch" },
			new Object[] { "Assess Batch" },
			new Object[] { "Quality Audit" },
			new Object[] { "Panel" },
			new Object[] { "Reports" }
		};
	}
	
	@DataProvider(name="settings")
	public Object[][] settings(){
		return new Object[][] {
			new Object[] { "Settings", "Trainers" },
			new Object[] { "Settings", "Locations" },
			new Object[] { "Settings", "Category" }
		};
	}
}
