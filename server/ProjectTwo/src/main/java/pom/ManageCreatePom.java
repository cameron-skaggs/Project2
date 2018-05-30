package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ManageCreatePom extends Pom{

	public ManageCreatePom(WebDriver driver) {
		super(driver);
	}

	public WebElement inputName() {
		String xpath = "//*[@id=\"trainingName\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public void selectTraining(String string) {
		String xpath = "//*[@id=\"trainingType\"]";
		
		select(xpath, string);
	}
	
	public void selectSkill(String string) {
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
	
	public WebElement inputStart() {
		String xpath = "//*[@id=\"start-date\"]/input";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement inputEnd() {
		String xpath = "//*[@id=\"end-date\"]/input";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement inputGood() {
		String xpath = "//*[@id=\"goodGrade\"]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement inputPassing() {
		String xpath = "//*[@id=\"borderlineGrade\"]";
		return driver.findElement(By.xpath(xpath));
	}
			
	public WebElement buttonSave() {
		String xpath = "//*[@id=\"createBatchModal\"]/div/div/div[3]/input";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonClose() {
		String xpath = "//*[@id=\"createBatchModal\"]/div/div/div[3]/button";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonX() {
		String xpath = "//*[@id=\"createBatchModal\"]/div/div/div[1]/button";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement modal() {
		String xpath = "//*[@id=\"createBatchModal\"]";
		return driver.findElement(By.xpath(xpath));
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
