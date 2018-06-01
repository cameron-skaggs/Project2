package testng;

import static org.testng.Assert.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
	LocalDate today;
	DateTimeFormatter format;
	
	@BeforeSuite
	public void beforeSuite() {
		driver = DriverFactory.get("chrome");
		wait = new WebDriverWait(driver, 10);
		home = new HomePom(driver);
		manage = new ManagePom(driver);
		today = LocalDate.now();
		format = DateTimeFormatter.ofPattern("MM dd yyyy");
		
		home.anchorManage().click();
	}
	
//	@Test(priority=1)
//	public void importBatch() {
//		WebElement importBatch = manage.anchorImportBatch();
//		WebElement x = manage.buttonImportBatchX();
//		WebElement buttonImport = manage.buttonImport();
//		WebElement close = manage.buttonImportClose();
//		WebElement modal = manage.modalImport();
//		
//		importBatch.click();
//		
//		button(x);
//		x.click();
//		
//		modal(modal, importBatch);		
//		importBatch.click();
//		
//		button(close);		
//		close.click();
//		
//		modal(modal, importBatch);		
//		importBatch.click();
//		
//		button(buttonImport);		
//		buttonImport.click();
//		close.click();
//		
//		modal(modal, importBatch);
//	}
//	
//	@Test(priority=2)
//	public void createBatchClose() {
//		WebElement createBatch = manage.anchorCreateBatch();
//		WebElement x = manage.buttonCreateBatchX();
//		WebElement close = manage.buttonCreateBatchClose();
//		WebElement modal = manage.modalCreateBatch();
//		
//		createBatch.click();
//		
//		button(x);
//		x.click();
//		
//		modal(modal, createBatch);
//		createBatch.click();
//		
//		button(close);
//		close.click();
//		
//		modal(modal, createBatch);
//		createBatch.click();
//	}
//	
//	@Test(priority=3, dataProvider="trainingtype")
//	public void createBatchTrainingType(String type) {
//		manage.selectTrainingType(type);
//	}
//	
//	@Test(priority=4, dataProvider="skilltype")
//	public void createBatchSkillType(String skill) {
//		manage.selectSkillType(skill);
//	}
//	
//	@Test(priority=5, dataProvider="location")
//	public void createBatchLocation(String state, String location) {
//		manage.selectLocation(state, location);
//	}
//	
//	@Test(priority=6, dataProvider="trainers")
//	public void createBatchTrainer(String trainer) {
//		manage.selectTrainer(trainer);
//	}
//	
//	@Test(priority=7, dataProvider="trainers")
//	public void createBatchCotrainer(String cotrainer) {
//		manage.selectCotrainer(cotrainer);
//	}
//	
//	@Test(priority=8)
//	public void createBatchSavePrepare() {
//		WebElement close = manage.buttonCreateBatchClose();
//		WebElement createBatch = manage.anchorCreateBatch();
//		WebElement modalCreateBatch = manage.modalCreateBatch();
//
//		close.click();
//		modal(modalCreateBatch, createBatch);
//	}
	
	@Test(priority=9)
	public void createBatchSavePass() {
		createBatchSendKeys();
	}
	
	@Test(priority=10)
	public void createBatchSaveDateFailure() {
		String location = "Revature LLC, 11730 Plaza America Drive, 2nd Floor Reston VA 20190";
		
		createBatchFailurePrepend();
		
		manage.inputTrainingName().sendKeys("1611 Jul11 Java");
		manage.selectTrainingType("Revature");
		manage.selectSkillType("J2EE");
		manage.selectLocation("VA", location);
		manage.selectTrainer("123");
		manage.selectCotrainer("123");
		manage.inputStartDate().sendKeys("04/16/2018");
		manage.inputEndDate().sendKeys("07/16/2017");
		manage.inputGoodGrade().sendKeys("80");
		manage.inputPassingGrade().sendKeys("50");

		manage.buttonCreateBatchSave().click();	
		
		createBatchFailureAppend();
	}	
	
	@Test(priority=11)
	public void createBatchSaveTrainerFailure() {
		String location = "Revature LLC, 11730 Plaza America Drive, 2nd Floor Reston VA 20190";
		
		createBatchFailurePrepend();
		
		manage.inputTrainingName().sendKeys("1611 Jul11 Java");
		manage.selectTrainingType("Revature");
		manage.selectSkillType("J2EE");
		manage.selectLocation("VA", location);
		manage.selectTrainer("123");
		manage.selectCotrainer("123");
		manage.inputStartDate().sendKeys("04/16/2018");
		manage.inputEndDate().sendKeys("07/16/2018");
		manage.inputGoodGrade().sendKeys("80");
		manage.inputPassingGrade().sendKeys("50");

		manage.buttonCreateBatchSave().click();	
		
		createBatchFailureAppend();
	}
	
	@Test(priority=12)
	public void createBatchSaveMissingFailure() {
		String location = "Revature LLC, 11730 Plaza America Drive, 2nd Floor Reston VA 20190";
		
		createBatchFailurePrepend();
		
		manage.inputTrainingName().sendKeys("1611 Jul11 Java");
		manage.selectTrainingType("Revature");
		manage.selectSkillType("J2EE");
		manage.selectLocation("VA", location);
		manage.selectTrainer("123");
		manage.selectCotrainer("123");
		manage.inputStartDate().sendKeys("04/16/2018");
		manage.inputEndDate().sendKeys("07/16/2018");
		manage.inputGoodGrade().sendKeys("80");
		//manage.inputPassingGrade().sendKeys("50");

		manage.buttonCreateBatchSave().click();	
		
		createBatchFailureAppend();
	}
	
	@Test(priority=13)
	public void deleteBatch() {
		WebElement redCross = manage.buttonDeleteBatchRedCross();
		WebElement x = manage.buttonDeleteBatchX();
		WebElement cancel = manage.buttonDeleteBatchCancel();
		WebElement delete = manage.buttonDeleteBatchDelete();
		WebElement modalCreateBatch = manage.modalCreateBatch();
		WebElement modalDeleteBatch = manage.modalDeleteBatch();
		WebElement modalInvalidBatchInfo = manage.modalInvalidBatchInfo();
		
		modal(modalCreateBatch, redCross);
		modal(modalInvalidBatchInfo, redCross);
		redCross.click();
		
		button(x);
		x.click();
		
		modal(modalDeleteBatch, redCross);
		redCross.click();
		
		modal(modalDeleteBatch, cancel);
		cancel.click();
		
		modal(modalDeleteBatch, redCross);
		redCross.click();
		
		modal(modalDeleteBatch, delete);
		delete.click();
		
		modal( modalDeleteBatch, home.anchorHome() );
	}
	
	@Test(priority=14)
	public void updateBatch() {
		createBatchSendKeys();
		
		WebElement close = manage.buttonUpdateBatchClose();
		WebElement update = manage.buttonUpdateBatchUpdate();
		WebElement pencil = manage.buttonUpdateBatchPencil();
		WebElement modal = manage.modalCreateBatch();
		WebElement trainingName = manage.inputTrainingName();
		
		modal(modal, pencil);
		pencil.click();
		
		modal(modal, close);
		close.click();
		
		modal(modal, pencil);
		pencil.click();
		
		modal(modal, update);
		trainingName.sendKeys("Script");
		update.click();	
		
		modal(modal, pencil);
	}
	
//	@AfterSuite
//	public void afterSuite() {
//		driver.close();
//	}
	
	@DataProvider(name="trainingtype")
	public Object[][] trainingType(){
		return new Object[][] {
			new Object[] { "Revature" },
			new Object[] { "Corporate" },
			new Object[] { "University" },
			new Object[] { "Other" }
		};
	}
	
	@DataProvider(name="skilltype")
	public Object[][] skillType(){
		return new Object[][] {
			new Object[] { "J2EE" },
			new Object[] { ".NET" },
			new Object[] { "SDET" },
			new Object[] { "BPM" },
			new Object[] { "Appian BPM" },
			new Object[] { "PEGA BPM" },
			new Object[] { "Microsoft Dynamics 365" },
			new Object[] { "JTA" },
			new Object[] { "Microservices" },
			new Object[] { "Oracle Fusion" },
			new Object[] { "Salesforce" },
			new Object[] { "Business Analyst" },
			new Object[] { "System Admin" },
			new Object[] { "QA" },
			new Object[] { "Other" }
		};		
	}
	
	@DataProvider(name="location")
	public Object[][] location(){
		return new Object[][] {
			new Object[] { "NY", "Tech Incubator at Queens College, 65-30 Kissena Blvd, CEP Hall 2 Queens NY 11367" },
			new Object[] { "VA", "Revature LLC, 11730 Plaza America Drive, 2nd Floor Reston VA 20190" }
		};
	}
	
	@DataProvider(name="trainers")
	public Object[][] trainers(){
		return new Object[][] {
			new Object[] { "123" },
			new Object[] { "Name" },
			new Object[] { "bfs" },
			new Object[] { "Patrick Walsh" },
			new Object[] { "Dan Pickles" },
			new Object[] { "Karan Dhirar" },
			new Object[] { "Brian Connolly" },
			new Object[] { "Genesis Bonds" },
			new Object[] { "Ankit Garg" },
			new Object[] { "Ryan Lessley" },
			new Object[] { "Steven Kelsey" },
			new Object[] { "Emily Higgins" },
			new Object[] { "Taylor Kemper" },
			new Object[] { "Richard Orr" },
			new Object[] { "Nickolas Jurczak" },
			new Object[] { "August Duet" },
			new Object[] { "Yuvaraj Damodaran" },
			new Object[] { "Fred Belotte" },
			new Object[] { "Mehrab Rahman" },
			new Object[] { "Peter Alagna" },
			new Object[] { "Mehrab Rahman" },
			new Object[] { "Peter Alagna" },
			new Object[] { "Stanley Medikonda" },
			new Object[] { "Gray Wynne" },
			new Object[] { "Orson Wallace" },
			new Object[] { "Shelby Levinson" },
			new Object[] { "Gray Wynne" },
			new Object[] { "Orson Wallace" },
			new Object[] { "Shelby Levinson" },
			new Object[] { "Walter Payne" },
			new Object[] { "Natalie Church" },
			new Object[] { "Archer Radcliff" },
			new Object[] { "Rajesh Yamunachari" },
			new Object[] { "Raghavan Swaminathan" },
			new Object[] { "Marvin" },
			new Object[] { "Spongebob Squarepants" },
			new Object[] { "Kermit Frog" },
			new Object[] { "!@#$%^&*()" }
		};
	}
	
	@DataProvider(name="trainingstatus")
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
	
	@DataProvider(name="years")
	public Object[][] years() {
		return new Object[][] {
			new Object[] { "2019" },
			new Object[] { "2018" },
			new Object[] { "2017" },
			new Object[] { "2016" }
		};
	}
	
	private void button(WebElement button) {
		ExpectedCondition<WebElement> condition = 
				ExpectedConditions.elementToBeClickable(button);
		
		wait.until(condition);		
	}
	
	private void modal(WebElement modal, WebElement anchor) {
		ExpectedCondition<Boolean> modalCondition =
				ExpectedConditions.invisibilityOf(modal);
		ExpectedCondition<WebElement> anchorCondition =
				ExpectedConditions.elementToBeClickable(anchor);
		
		wait.until(modalCondition);
		wait.until(anchorCondition);
	}
	
	private void createBatchFailurePrepend() {
		WebElement createBatch = manage.anchorCreateBatch();
		WebElement createBatchModal = manage.modalCreateBatch();
				
		modal(createBatchModal, createBatch);
		createBatch.click();
	}
	
	private void createBatchFailureAppend() {
		WebElement invalidBatchModal = manage.modalInvalidBatchInfo();
		WebElement createBatchClose = manage.buttonCreateBatchClose();
		WebElement invalidBatchX = manage.buttonInvalidBatchInfoX();
		
		button(invalidBatchX);
		invalidBatchX.click();
		
		modal(invalidBatchModal, createBatchClose);
		createBatchClose.click();
	}
	
	private void createBatchSendKeys() {
		home.anchorManage().click();
		manage.anchorCreateBatch().click();
		
		String location = "Revature LLC, 11730 Plaza America Drive, 2nd Floor Reston VA 20190";
		
		manage.inputTrainingName().sendKeys("1611 Jul11 Java");
		manage.selectTrainingType("Revature");
		manage.selectSkillType("J2EE");
		manage.selectLocation("VA", location);
		manage.selectTrainer("123");
		manage.selectCotrainer("Name");
		manage.inputStartDate().sendKeys("04/16/2018");
		manage.inputEndDate().sendKeys("07/16/2018");
		manage.inputGoodGrade().sendKeys("80");
		manage.inputPassingGrade().sendKeys("50");
		
		manage.buttonCreateBatchSave().click();	
		
		WebElement modalCreateBatch = manage.modalCreateBatch();
		WebElement createBatch = manage.anchorCreateBatch();
		modal(modalCreateBatch, createBatch);
	}
}
