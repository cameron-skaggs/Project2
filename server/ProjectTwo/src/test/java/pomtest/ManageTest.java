package pomtest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import driver.DriverFactory;
import pom.HomePom;
import pom.ManagePom;

public class ManageTest {
	WebDriver driver;
	WebDriverWait wait;
	HomePom home;
	ManagePom manage;
	
	@BeforeSuite
	public void beforeSuite() {
		driver = DriverFactory.get("chrome");
		wait = new WebDriverWait(driver, 1);
		home = new HomePom(driver);
		manage = new ManagePom(driver);
		
		home.anchorManage().click();
	}
	
	@Test(priority=1)
	public void clickYear() {
		WebElement year = manage.anchorYear();
		assertEquals("2018", year.getText());
	}
	
	@Test(priority=2)
	public void clickCreateBatch() {
		WebElement anchor = manage.anchorCreate();
		WebElement input = manage.inputCreate();
		WebElement close = manage.buttonCreateClose();
		
		anchor.click();
		
		String string = input.getAttribute("value");
		assertEquals("Save", string);

		modalWait(close);
		close.click();
	}
	
	@Test(priority=3)
	public void clickImportBatch() {
		WebElement anchor = manage.anchorImport();
		WebElement input = manage.inputImport();
		WebElement close = manage.buttonImportClose();
		
		modalWait(anchor);
		anchor.click();

		String string = input.getAttribute("value");
		assertEquals("Import", string);
		
		modalWait(close);
		close.click();
	}
	
	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}
	
	public void modalWait(WebElement webElement) {
		ExpectedCondition<WebElement> condition =
				ExpectedConditions.elementToBeClickable(webElement);
		wait.until(condition);
	}
	
}
