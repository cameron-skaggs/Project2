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
		String xpath = "//*[@id=\"viewTraineeModal\"]/div/div/div[2]/div[1]/div/a[1]";
		return driver.findElement(By.xpath(xpath));
	} 
	//*[@id="viewTraineeModal"]/div/div/div[2]/div[2]/div/div/a
	//*[@id="viewTraineeModal"]/div/div/div[2]/div[2]/div/div/a
	
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
	
	public WebElement modal() {
		String xpath = "//*[@id=\"viewTraineeModal\"]";
		return driver.findElement(By.xpath(xpath));
	}
}
