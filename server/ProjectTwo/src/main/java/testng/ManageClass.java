package testng;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
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

public class ManageClass {
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
		
		home.listNavbar("Manage Batch");
	}
	
	@Test(priority=1)
	public void importBatch() {
		WebElement importBatch = manage.anchorImportBatch();
		WebElement x = manage.buttonImportBatchX();
		WebElement buttonImport = manage.buttonImport();
		WebElement close = manage.buttonImportClose();
		WebElement modal = manage.modalImport();
		
		importBatch.click();
		
		button(x);
		x.click();
		
		modal(modal, importBatch);		
		importBatch.click();
		
		button(close);		
		close.click();
		
		modal(modal, importBatch);		
		importBatch.click();
		
		button(buttonImport);		
		buttonImport.click();
		close.click();
		
		modal(modal, importBatch);
	}
	
	@Test(priority=2)
	public void createBatchClose() {
		WebElement createBatch = manage.anchorCreateBatch();
		WebElement x = manage.buttonCreateBatchX();
		WebElement close = manage.buttonCreateBatchClose();
		WebElement modal = manage.modalCreateBatch();
		
		createBatch.click();
		
		button(x);
		x.click();
		
		modal(modal, createBatch);
		createBatch.click();
		
		button(close);
		close.click();
		
		modal(modal, createBatch);
		createBatch.click();
	}
	
	@Test(priority=3, dataProvider="trainingtype")
	public void createBatchTrainingType(String type) {
		manage.selectTrainingType(type);
	}
	
	@Test(priority=4, dataProvider="skilltype")
	public void createBatchSkillType(String skill) {
		manage.selectSkillType(skill);
	}
	
	@Test(priority=5, dataProvider="location")
	public void createBatchLocation(String state, String location) {
		manage.selectLocation(state, location);
	}
	
	@Test(priority=6, dataProvider="trainers")
	public void createBatchTrainer(String trainer) {
		manage.selectTrainer(trainer);
	}
	
	@Test(priority=7, dataProvider="trainers")
	public void createBatchCotrainer(String cotrainer) {
		manage.selectCotrainer(cotrainer);
	}
	
	@Test(priority=8)
	public void createBatchSavePrepare() {
		WebElement close = manage.buttonCreateBatchClose();
		WebElement createBatch = manage.anchorCreateBatch();
		WebElement modalCreateBatch = manage.modalCreateBatch();

		close.click();
		modal(modalCreateBatch, createBatch);
	}
	
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
		manage.selectTrainer("Patrick Walsh");
		manage.selectCotrainer("Dan Pickles");
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
		manage.selectTrainer("Patrick Walsh");
		manage.selectCotrainer("Patrick Walsh");
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
		manage.selectTrainer("Patrick Walsh");
		manage.selectCotrainer("Dan Pickles");
		manage.inputStartDate().sendKeys("04/16/2018");
		manage.inputEndDate().sendKeys("07/16/2018");
		manage.inputGoodGrade().sendKeys("80");
		manage.inputPassingGrade().sendKeys("50");
		manage.buttonCreateBatchSave().click();
	}
	
//	@Test(priority=13)
//	public void deleteBatchError() {
//		WebElement redCross = manage.buttonDeleteBatchRedCrossError();
//		WebElement confirmX = manage.buttonDeleteBatchConfirmX();
//		WebElement cancel = manage.buttonDeleteBatchCancel();
//		WebElement delete = manage.buttonDeleteBatchDelete();
//		WebElement errorX = manage.buttonDeleteBatchErrorX();
//		WebElement errorOk = manage.buttonDeleteBatchErrorOk();
//		WebElement modalDeleteBatch = manage.modalDeleteBatch();
//		WebElement modalDeleteBatchError = manage.modalDeleteBatchError();
//		
//		button(redCross);
//		redCross.click();
//		
//		button(confirmX);
//		confirmX.click();
//		
//		button(redCross);
//		redCross.click();
//		
//		button(cancel);
//		cancel.click();
//		
//		button(redCross);
//		redCross.click();
//		
//		button(delete);
//		delete.click();
//		
//		button(errorX);
//		errorX.click();
//		
//		button(redCross);
//		redCross.click();
//		
//		button(errorOk);
//		errorOk.click();
//		
//		
//	}
//	
//	@Test(priority=14)
//	public void deleteBatch() {
//		WebElement redCross = manage.buttonDeleteBatchRedCross();
//		WebElement x = manage.buttonDeleteBatchConfirmX();
//		WebElement cancel = manage.buttonDeleteBatchCancel();
//		WebElement delete = manage.buttonDeleteBatchDelete();
//		WebElement modalCreateBatch = manage.modalCreateBatch();
//		WebElement modalDeleteBatch = manage.modalDeleteBatch();
//		WebElement modalInvalidBatchInfo = manage.modalInvalidBatchInfo();
//		
//		modal(modalCreateBatch, redCross);
//		modal(modalInvalidBatchInfo, redCross);
//		redCross.click();
//		
//		button(x);
//		x.click();
//		
//		modal(modalDeleteBatch, redCross);
//		redCross.click();
//		
//		modal(modalDeleteBatch, cancel);
//		cancel.click();
//		
//		modal(modalDeleteBatch, redCross);
//		redCross.click();
//		
//		modal(modalDeleteBatch, delete);
//		delete.click();
//		
//		modal( modalDeleteBatch, delete );
//		home.listNavbar("Home");
//	}
//	
	
	
	@Test(priority=15)
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
	
	@Test(priority=16)
	public void viewTrainees() {
		WebElement user = manage.anchorViewTraineesUser();
		WebElement x = manage.buttonViewTraineesX();
		WebElement active = manage.anchorViewTraineesActive();
		WebElement inactive = manage.anchorViewTraineesInactive();
		WebElement modal = manage.modalViewTrainees();
		
		user.click();
		
		modal(modal, x);
		x.click();
		
		modal(modal, user);
		user.click();
		
		modal(modal, active);
		active.click();
		
		button(inactive);
		inactive.click();
	}
	
	@Test(priority=17)
	public void addTrainees() {
		WebElement addTrainee = manage.anchorAddTrainees();
		WebElement x = manage.buttonAddTraineesX();
		WebElement close = manage.buttonAddTraineesClose();
		WebElement modalAddTrainees = manage.modalAddTrainees();
		
		addTrainee.click();
		
		modal(modalAddTrainees, x);
		x.click();
		
		modal(modalAddTrainees, addTrainee);
		addTrainee.click();
		
		modal(modalAddTrainees, close);
		close.click();
		
		modal(modalAddTrainees, addTrainee);
		addTrainee.click();
		
		modal(modalAddTrainees, close);
	}
	
	@Test(priority=18, dataProvider="trainingstatus")
	public void addTraineesTrainingStatus(String status) {
		manage.selectAddTraineesTrainingStatus(status);
	}
	
	@Test(priority=19)
	public void addTraineesFailureFullName() {
		WebElement save = manage.inputAddTraineesSave();
		save.click();		
	}
	
	@Test(priority=20)
	public void addTraineesFailureEmail() {
		WebElement fullName = manage.inputAddTraineesFullName();
		WebElement save = manage.inputAddTraineesSave();
		
		fullName.sendKeys("Full Name");
		save.click();		
	}
	
	@Test(priority=21)
	public void addTraineesFailureTrainingStatus() {
		WebElement email = manage.inputAddTraineesEmail();
		WebElement save = manage.inputAddTraineesSave();
		
		email.sendKeys("email@email.com");
		save.click();
	}
	
	@Test(priority=22)
	public void addTraineesPassMinimum() {
		WebElement save = manage.inputAddTraineesSave();
		manage.selectAddTraineesTrainingStatus("Signed");
		save.click();
	}
	
//	@Test(priority=23)
//	public void addTraineesPassMaximum() {
//		manage.anchorAddTrainees().click();
//		addTraineesSendKeys();
//	}
	
	private void addTraineesSendKeys() {
		WebElement fullName = manage.inputAddTraineesFullName();
		WebElement email = manage.inputAddTraineesEmail();
		WebElement skypeId = manage.inputAddTraineesSkypeId();
		WebElement phone = manage.inputAddTraineesPhone();
		WebElement college = manage.inputAddTraineesCollege();
		WebElement degree = manage.inputAddTraineesDegree();
		WebElement major = manage.inputAddTraineesMajor();
		WebElement recruiterName = manage.inputAddTraineesRecruiterName();
		WebElement techScreenerName = manage.inputAddTraineesTechScreenerName();
		WebElement projectCompletion = manage.inputAddTraineesProjectCompletion();
		WebElement profileUrl = manage.inputAddTraineesProfileUrl();
		WebElement save = manage.inputAddTraineesSave();
		
		fullName.sendKeys("Full Name");
		email.sendKeys("email@email.com");
		skypeId.sendKeys("Skypeid");
		phone.sendKeys("(123)-456-7890");
		college.sendKeys("College");
		degree.sendKeys("Degree");
		major.sendKeys("Major");
		recruiterName.sendKeys("Recruiter Name");
		techScreenerName.sendKeys("Tech Screener Name");
		projectCompletion.sendKeys("0%");
		profileUrl.sendKeys("http://www.example.com/revature");
		manage.selectAddTraineesTrainingStatus("Signed");
		save.click();
	}
	
	@AfterSuite
	public void afterSuite() {
		driver.close();
	}
	
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
			new Object[] { "Kermit Frog" }
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
		
		button(createBatch);
		modal(createBatchModal, createBatch);
		createBatch.click();
	}
	
	private void createBatchFailureAppend() {
		WebElement invalidBatchModal = manage.modalInvalidBatchInfo();
		WebElement createBatchClose = manage.buttonCreateBatchClose();
		WebElement invalidBatchOk = manage.buttonInvalidBatchInfoOk();
		
		button(invalidBatchOk);
		invalidBatchOk.click();
		
		modal(invalidBatchModal, createBatchClose);
		createBatchClose.click();
	}
	
	private void createBatchSendKeys() {
		home.listNavbar("Manage Batch");
		manage.anchorCreateBatch().click();
		
		String location = "Revature LLC, 11730 Plaza America Drive, 2nd Floor Reston VA 20190";
		
		manage.inputTrainingName().sendKeys("1611 Jul11 Java");
		manage.selectTrainingType("Revature");
		manage.selectSkillType("J2EE");
		manage.selectLocation("VA", location);
		manage.selectTrainer("Patrick Walsh");
		manage.selectCotrainer("Dan Pickles");
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
