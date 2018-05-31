package testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
 
import driver.DriverFactory;
import pom.HomePom;

public class HomeTest {
	WebDriver driver;
	HomePom home;
	
	@BeforeSuite
	public void beforeSuite() {
		driver = DriverFactory.get("chrome");
	}
	
	@Test(priority=1)
	public void goHome() {
		home = new HomePom(driver);
		assertEquals("Caliber | Performance Management", home.title());
	}
	
	@Test(priority=2)
	public void clickHome() {
		home.anchorHome().click();
		assertEquals("Caliber | Performance Management", home.title());
	}
	
	@Test(priority=3)
	public void clickManageBatch() {
		home.anchorManage().click();
		String xpath = "//*[@id=\"manage\"]/div[1]/div/div/ul/li[2]/a";
		String text = elementTrim(xpath);
		assertEquals("ImportBatch", text);
	}
	
	@Test(priority=4)
	public void clickAssessBatch() {
		home.anchorAssess().click();
		String xpath = "/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[3]/a";
		String text = elementTrim(xpath);
		assertEquals("CreateAssessment", text);
	}
	
	@Test(priority=5)
	public void clickReports() {
		home.anchorReports().click();
		String xpath = "/html/body/div/ui-view/nav/div/ul[2]/li[4]/a";
		String text = elementTrim(xpath);
		assertEquals("Reports", text);
	}
	
	public String elementTrim(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		String string = element.getText();
		return string.replace(" ", "");
	}
	
	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}
}
