package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ManagePom extends Pom {

	public ManagePom(WebDriver driver) {
		super(driver);
	}
	
	/* Import Batch */
	
	public WebElement anchorImportBatch() {
		String xpath = "//*[@id=\"manage\"]/div[1]/div/div/ul/li[2]/a";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonImportBatchX() {
		String xpath = "//*[@id=\"importBatchModal\"]/div/div/div[1]/button";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonImport() {
		String xpath = "//*[@id=\"importBatchModal\"]/div/div/div[3]/input";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonImportClose() {
		String xpath = "//*[@id=\"importBatchModal\"]/div/div/div[3]/button";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement modalImport() {
		String xpath = "//*[@id=\"importBatchModal\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* Create Batch */

	public WebElement anchorCreateBatch() {
		String xpath = "//*[@id=\"manage\"]/div[1]/div/div/ul/li[3]/a";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonCreateBatchClose() {
		String xpath = "//*[@id=\"createBatchModal\"]/div/div/div[3]/button";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonCreateBatchSave() {
		String xpath = "//*[@id=\"createBatchModal\"]/div/div/div[3]/input";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonCreateBatchX() {
		String xpath = "//*[@id=\"createBatchModal\"]/div/div/div[1]/button";
		return driver.findElement(By.xpath(xpath));
	}

	public WebElement modalCreateBatch() {
		String xpath = "//*[@id=\"createBatchModal\"]";
		return driver.findElement(By.xpath(xpath));
	}	
	
	public WebElement inputTrainingName() {
		String xpath = "//*[@id=\"trainingName\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public void selectTrainingType(String string) {
		String xpath = "//*[@id=\"trainingType\"]";
		select(xpath, string);
	}
	
	public void selectSkillType(String string) {
		String xpath = "//*[@id=\"skillType\"]";
		select(xpath, string);
	}
	
	public void selectLocation(String state, String location) {
		String xpath = "//*[@id=\"location\"]";
		selectLocation(xpath, state, location);
	}
	
	public void selectTrainer(String string) {
		String xpath = "//*[@id=\"trainer\"]";
		select(xpath, string);
	}
	
	public void selectCotrainer(String string) {
		String xpath = "//*[@id=\"co-trainer\"]";
		select(xpath, string);
	}
	
	public WebElement inputStartDate() {
		String xpath = "//*[@id=\"start-date\"]/input";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement inputEndDate() {
		String xpath = "//*[@id=\"end-date\"]/input";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement inputGoodGrade() {
		String xpath = "//*[@id=\"goodGrade\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement inputPassingGrade() {
		String xpath = "//*[@id=\"borderlineGrade\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonInvalidBatchInfoX() {
		String xpath = "//*[@id=\"checkBatchModal\"]/div/div/div[1]/button";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonInvalidBatchInfoOk() {
		String xpath = "//*[@id=\"checkBatchModal\"]/div/div/div[3]/button";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement modalInvalidBatchInfo() {
		String xpath = "//*[@id=\"checkBatchModal\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* Delete Batch */
	public WebElement buttonDeleteBatchRedCross() {
		String xpath = "//*[@id=\"manage\"]/div[2]/div/div/table/tbody/tr/td[13]/a";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonDeleteBatchX() {
		String xpath = "//*[@id=\"deleteBatchModal\"]/div/div/div[1]/button";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonDeleteBatchDelete() {
		String xpath = "//*[@id=\"deleteBatchModal\"]/div/div/div[3]/input";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonDeleteBatchCancel() {
		String xpath = "//*[@id=\"deleteBatchModal\"]/div/div/div[3]/button";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement modalDeleteBatch() {
		String xpath = "//*[@id=\"deleteBatchModal\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* Update Batch */
	
	public WebElement buttonUpdateBatchPencil() {
		String xpath = "//*[@id=\"manage\"]/div[2]/div/div/table/tbody/tr/td[12]/a";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonUpdateBatchX() {
		String xpath = "//*[@id=\"createBatchModal\"]/div/div/div[1]/button";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonUpdateBatchClose() {
		String xpath = "//*[@id=\"createBatchModal\"]/div/div/div[3]/button";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonUpdateBatchUpdate() {
		String xpath = "//*[@id=\"createBatchModal\"]/div/div/div[3]/input";
		return driver.findElement(By.xpath(xpath));
	}	
	
	/* View Trainees */
	
	public WebElement buttonViewTraineeX() {
		String xpath = "//*[@id=\"viewTraineeModal\"]/div/div/div[1]/button";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement anchorViewTraineeActive() {
		String xpath = "//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[1]/div/a[1]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement anchorViewTrainInactive() {
		String xpath = "//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[1]/div/a[2]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement anchorAddTrainee() {
		String xpath = "//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[2]/div/div/a";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* Add Trainees */
	
	public WebElement modalViewTrainee() {
		String xpath = "//*[@id=\"viewTraineeModal\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement anchorTrainee() {
		String xpath = "//*[@id=\"manage\"]/div[2]/div/div/table/tbody/tr[1]/td[11]/a";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement anchorTraineeEdit() {
		String xpath = "//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[14]/a";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement anchorTraineeDelete() {
		String xpath = "//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[15]/a";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement modalAddTrainee() {
		String xpath = "//*[@id=\"addTraineeModal\"]";
		return driver.findElement(By.xpath(xpath));
	}

	public WebElement inputName() {
		String xpath = "//*[@id=\"traineeName\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement inputEmail() {
		String xpath = "//*[@id=\"traineeEmail\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement inputSkype() {
		String xpath = "//*[@id=\"traineeSkype\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement inputPhone() {
		String xpath = "//*[@id=\"traineePhone\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement inputCollege() {
		String xpath = "//*[@id=\"traineeCollege\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement inputDegree() {
		String xpath = "//*[@id=\"traineeDegree\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement inputMajor() {
		String xpath = "//*[@id=\"traineeMajor\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement inputRecruiter() {
		String xpath = "//*[@id=\"traineeRecruiterName\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement inputTech() {
		String xpath = "//*[@id=\"traineeTechScreenerName\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement inputProject() {
		String xpath = "//*[@id=\"traineeProjectCompletion\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement inputProfile() {
		String xpath = "//*[@id=\"traineeName\"]/html/body/div[1]/ui-view/ui-view/div/div[7]/form/div/div/div/div[2]/div[1]/div[6]/div/input";
		return driver.findElement(By.xpath(xpath));
	}
	
	public void selectTraining(String string) {
		String xpath = "//*[@id=\"traineeStatus\"]";
		WebElement element = driver.findElement(By.xpath(xpath));
		Select select = new Select(element);
		select.selectByValue(string);
	}
	
	public WebElement inputSave() {
		String xpath = "//*[@id=\"addTraineeModal\"]/div/div/div[2]/div[2]/input[1]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonCloseAddTrainee() {
		String xpath = "//*[@id=\"viewTraineeModal\"]/div/div/div[1]/button";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* Add Trainees end */
		
	public WebElement anchorYear() {
		String xpath = "//*[@id=\"manage\"]/div[1]/div/div/ul/li[1]/a";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement yearItems(String year) {
		return driver.findElement(By.linkText(year));
	}
			
	private void select(String xpath, String text) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select select = new Select(element);
		
		select.selectByValue(text);
	}
	
	private void selectLocation(String xpath, String state, String location) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select select = new Select(element);
		
		select.selectByVisibleText(location);
	}
}
