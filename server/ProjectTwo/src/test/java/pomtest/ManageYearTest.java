package pomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import driver.DriverFactory;
import pom.HomePom;
import pom.ManagePom;
import pom.ManageYearPom;

public class ManageYearTest {
	WebDriver driver;
	WebDriverWait wait;
	HomePom home;
	ManagePom manage;
	ManageYearPom manageyear;
	
	@BeforeSuite
	public void beforeSuite() {
		driver = DriverFactory.get("chrome");
		wait = new WebDriverWait(driver, 1);
		home = new HomePom(driver);
		manage = new ManagePom(driver);
		manageyear = new ManageYearPom(driver);
		
		home.anchorManage().click();
	}
	
	@Test(priority=1, dataProvider="years")
	public void listYears(String year) {
		manage.anchorYear().click();
		WebElement item = manageyear.yearItems(year);
		item.click();
	}
	
	@AfterSuite
	public void afterSuite() {
		driver.close();
	}
	
	@DataProvider(name="years")
	public Object[][] years() {
		return new Object[][] {
			new Object[] { "2019" },
			new Object[] { "2018" },
			new Object[] { "2017" },
			new Object[] { "2016" }
		};
	}
}
