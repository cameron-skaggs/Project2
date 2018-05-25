package pomtest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import driver.DriverFactory;
import pom.HomePom;
import pom.ManagePom;

public class ManageTest {
	WebDriver driver;
	HomePom home;
	ManagePom manage;
	
	@BeforeSuite
	public void beforeSuite() {
		driver = DriverFactory.get("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		home = new HomePom(driver);
		manage = new ManagePom(driver);
		
		home.anchorManage().click();
	}
	
	@Test(priority=1)
	public void clickYear() {
		WebElement year = manage.anchorYear();
		assertEquals("2018", year.getText());
		year.click();
	}
	
	@Test(priority=2)
	public void clickCreateBatch() {
		WebElement create = manage.anchorCreate();
		create.click();
		String xpath = "//*[@id=\"batchModalLabel\"]";
		String text = elementTrim(xpath);
		assertEquals("Create New Batch", text);
	}
	
	public String elementTrim(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		String string = element.getText();
		return string.replace(" ", "");
	}
}
