package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageYearPom extends Pom{

	public ManageYearPom(WebDriver driver) {
		super(driver);
	}
	
	public WebElement yearItems(String year) {
		return driver.findElement(By.linkText(year));
	}
}
