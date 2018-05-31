package testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
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
		WebElement modal = manage.createBatchModal();
		
		anchor.click();
		
		String string = input.getAttribute("value");
		assertEquals("Save", string);

		modal(modal, close);
		close.click();
	}
	
	@Test(priority=3)
	public void clickImportBatch() {
		WebElement anchor = manage.anchorImport();
		WebElement input = manage.inputImport();
		WebElement close = manage.buttonImportClose();
		WebElement modal = manage.createBatchModal();
		
		modal(modal, anchor);
		anchor.click();

		String string = input.getAttribute("value");
		assertEquals("Import", string);
		
		modal(modal, close);
		close.click();
	}
	
	@Test(priority=4, dataProvider="years")
	public void listYears(String year) {
		WebElement anchor = manage.anchorYear();
		WebElement modal = manage.importBatchModal();
		
		modal(modal, anchor);
		anchor.click();
		manage.yearItems(year).click();
	}
	
	@AfterSuite
	public void afterSuite() {
		driver.quit();
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
	
	private void modal(WebElement modal, WebElement anchor) {
		ExpectedCondition<Boolean> modalCondition =
				ExpectedConditions.invisibilityOf(modal);
		ExpectedCondition<WebElement> anchorCondition =
				ExpectedConditions.elementToBeClickable(anchor);
		
		wait.until(modalCondition);
		wait.until(anchorCondition);
	}
}
