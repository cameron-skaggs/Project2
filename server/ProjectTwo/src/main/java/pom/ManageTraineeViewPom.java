package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageTraineeViewPom extends Pom{

	public ManageTraineeViewPom(WebDriver driver) {
		super(driver);
	}

	public WebElement anchorTrainee() {
		String xpath = "//*[@id=\"manage\"]/div[2]/div/div/table/tbody/tr[1]/td[11]/a";
		return driver.findElement(By.xpath(xpath));
		//TODO
	}
	
	public WebElement buttonTraineeX() {
		String xpath = "//*[@id=\"viewTraineeModal\"]/div/div/div[1]/button";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement anchorTraineeActive() {
		String xpath = "//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[1]/div/a[1]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement anchorTrainInactive() {
		String xpath = "//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[1]/div/a[2]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement anchorTraineeAdd() {
		String xpath = "//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[1]/div/a";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement anchorTraineeEdit() {
		String xpath = "//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[14]/a";
		return driver.findElement(By.xpath(xpath));
		//TODO
	}
	
	public WebElement anchorTraineeDelete() {
		String xpath = "//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[15]/a";
		return driver.findElement(By.xpath(xpath));
		//TODO
	}
	
	public WebElement modalView() {
		String xpath = "//*[@id=\"viewTraineeModal\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement modalAdd() {
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
		String xpath = "//*[@id=\"traineeName\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement selectTraining(String string) {
		return driver.findElement(By.linkText(string));
	}
	
	public WebElement inputSave() {
		String xpath = "//*[@id=\"addTraineeModal\"]/div/div/div[2]/div[2]/input[1]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonClose() {
		String xpath = "//*[@id=\"addTraineeModal\"]/div/div/div[2]/div[2]/button[1]";
		return driver.findElement(By.xpath(xpath));
	}
}
