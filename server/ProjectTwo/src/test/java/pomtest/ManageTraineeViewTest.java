package pomtest;

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
import pom.ManageTraineeViewPom;
import pom.ManageYearPom;

public class ManageTraineeViewTest {
	WebDriver driver;
	WebDriverWait wait;
	HomePom home;
	ManagePom manage;
	ManageYearPom year;
	ManageTraineeViewPom view;
	
	@BeforeSuite
	public void beforeSuite() {
		driver = DriverFactory.get("chrome");
		wait = new WebDriverWait(driver, 1);
		home = new HomePom(driver);
		manage = new ManagePom(driver);
		year = new ManageYearPom(driver);
		view = new ManageTraineeViewPom(driver);
		
		home.anchorManage().click();
		manage.anchorYear().click();
		year.yearItems("2019").click();
	}
	
	@Test(priority=1)
	public void traineeView() {
		view.anchorTrainee().click();
	}
	
	@Test(priority=2)
	public void traineeActive() {
		WebElement active = view.anchorTraineeActive();
		WebElement inactive = view.anchorTrainInactive();
		WebElement modal = view.modalView();
		
		modal(modal, active);
		active.click();
		inactive.click();
		active.click();
	}
	
	@Test(priority=3)
	public void traineeAdd() {
		view.anchorTraineeAdd().click();
	}
	
	@Test(priority=4)
	public void inputName() {
		WebElement modal = view.modalAdd();
		WebElement input = view.inputName();
		
		modal(modal, input);
		
		input.sendKeys("Full Name");
	}
	
	@Test(priority=5)
	public void inputEmail() {
		view.inputEmail().sendKeys("email@email.com");
	}
	
	@Test(priority=6)
	public void inputSkype() {
		view.inputSkype().sendKeys("skype");
	}
	
	@Test(priority=7)
	public void inputPhone() {
		view.inputPhone().sendKeys("(xxx)-xxx-xxxx");
	}

	@Test(priority=8)
	public void inputCollege() {
		view.inputCollege().sendKeys("college");
	}
	
	@Test(priority=9)
	public void inputDegree() {
		view.inputDegree().sendKeys("degree");
	}
	
	@Test(priority=10)
	public void inputMajor() {
		view.inputMajor().sendKeys("major");
	}
	
	@Test(priority=11)
	public void inputRecruiter() {
		view.inputRecruiter().sendKeys("recruiter name");
	}
	
	@Test(priority=12)
	public void inputTech() {
		view.inputTech().sendKeys("tech screener name");
	}
	
	@Test(priority=13)
	public void inputProject() {
		view.inputProject().sendKeys("0%");
	}
	
	@Test(priority=14)
	public void inputProfile() {
		view.inputProfile().sendKeys("http://www.example.com/revature");
	}
	
	@Test(priority=15, dataProvider="trainingstatus")
	public void selectTraining(String status) {
		view.selectTraining(status).click();
	}
	
	@Test(priority=16)
	public void save() {
		view.inputSave().submit();
	}
	
	@Test(priority=17)
	public void close() {
		WebElement modal = view.modalAdd();
		WebElement anchor = view.anchorTraineeAdd();
		WebElement close = view.buttonClose();
		
		anchor.click();
		close.click();
	}
	
	@Test(priority=18)
	public void x() {
		WebElement anchor = view.anchorTraineeAdd();
		WebElement x = view.buttonTraineeX();
		
		anchor.click();
		x.click();
	}
	
	
	@AfterSuite
	public void afterSuite() {
		driver.close();
	}
	
	private void modal(WebElement modal, WebElement anchor) {
		ExpectedCondition<Boolean> modalCondition =
				ExpectedConditions.invisibilityOf(modal);
		ExpectedCondition<WebElement> anchorCondition =
				ExpectedConditions.elementToBeClickable(anchor);
		
		wait.until(modalCondition);
		wait.until(anchorCondition);
	}
	
	@DataProvider(name="training")
	public Object[][] training(){
		return new Object[][] {
			new Object[] { "Signed" },
			new Object[] { "Selected" },
			new Object[] { "Training" },
			new Object[] { "Marketing" },
			new Object[] { "Confirmed" },
			new Object[] { "Employed" },
			new Object[] { "Dropped" }
		};
	}
}
