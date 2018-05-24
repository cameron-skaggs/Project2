package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePom extends Pom {
	private static final String URL = "https://dev-caliber.revature.tech/caliber/";

	public HomePom(WebDriver driver) {
		super(driver);
		driver.get(URL);
	}
	
	public WebElement anchorHome() {
		return driver.findElement(By.linkText("Home"));
	}
	
	public WebElement anchorManage() {
		return driver.findElement(By.linkText("Manage Batch"));
	}
	
	public WebElement anchorAssess() {
		return driver.findElement(By.linkText("Assess Batch"));
	}
	
	public WebElement anchorReports() {
		return driver.findElement(By.linkText("Reports"));
	}
	
	public WebElement anchorGuide() {
		return driver.findElement(By.linkText("user guide"));
	}
}