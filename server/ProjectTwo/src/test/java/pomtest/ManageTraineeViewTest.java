package pomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import driver.DriverFactory;
import pom.HomePom;
import pom.ManageTraineeViewPom;

public class ManageTraineeViewTest {
	WebDriver driver;
	WebDriverWait wait;
	HomePom home;
	ManageTraineeViewPom update;
	
	@BeforeSuite
	public void beforeSuite() {
		driver = DriverFactory.get("chrome");
		wait = new WebDriverWait(driver, 1);
		home = new HomePom(driver);
		update = new ManageTraineeViewPom(driver);
		
		home.anchorManage().click();
	}
	
	@Test(priority=1)
	public void traineeView() {
		update.anchorTrainee().click();
		
	}
	
	@Test(priority=2)
	public void traineeActive() {
		WebElement active = update.anchorTraineeActive();
		WebElement inactive = update.anchorTrainInactive();
		WebElement modal = update.modal();
		
		modal(modal, active);
		active.click();
		
		
		inactive.click();
	}
	
	@Test(priority=3)
	public void traineeAdd() {
		
	}
	
	
	
	
//	@AfterSuite
//	public void afterSuite() {
//		driver.close();
//	}
	
	private void modal(WebElement modal, WebElement anchor) {
		ExpectedCondition<Boolean> modalCondition =
				ExpectedConditions.invisibilityOf(modal);
		ExpectedCondition<WebElement> anchorCondition =
				ExpectedConditions.elementToBeClickable(anchor);
		
		wait.until(modalCondition);
		wait.until(anchorCondition);
	}
}
