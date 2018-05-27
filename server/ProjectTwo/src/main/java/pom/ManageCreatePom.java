package pom;

import java.util.List;

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
	
	public void selectLocation(String string) {
		String xpath = "//*[@id=\"location\"]";
		select(xpath, string);
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
		return null;
	}
	
	public WebElement inputEnd() {
		String xpath = "//*[@id=\"start-date\"]/input";
		return null;
	}
	
	public WebElement inputGood() {
		String xpath = "//*[@id=\"goodGrade\"]";
		return null;
	}
	
	public WebElement inputPassing() {
		String xpath = "//*[@id=\"borderlineGrade\"]";
		return null;
	}

	public void select(String xpath, String text) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select select = new Select(element);
		
		xpath += "/option";
		List<WebElement> options = driver.findElements(By.xpath(xpath));
		
		element = options.stream()
			.filter( option -> option.getText().equals(text) )
			.findFirst()
			.get();
		
		select.selectByValue(text);
	}
}
