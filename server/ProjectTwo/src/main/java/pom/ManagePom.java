package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManagePom extends Pom {

	public ManagePom(WebDriver driver) {
		super(driver);
	}

	public WebElement anchorYear() {
		String xpath = "//*[@id=\"manage\"]/div[1]/div/div/ul/li[1]/a";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement anchorCreate() {
		String xpath = "//*[@id=\"manage\"]/div[1]/div/div/ul/li[3]/a";
		return driver.findElement(By.xpath(xpath));
	}

	public WebElement anchorImport() {
		String xpath = "//*[@id=\"manage\"]/div[1]/div/div/ul/li[2]/a";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement inputCreate() {
		String xpath = "//*[@id=\"createBatchModal\"]/div/div/div[3]/input";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement inputImport() {
		String xpath = "//*[@id=\"importBatchModal\"]/div/div/div[3]/input";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonCreateClose() {
		String xpath = "//*[@id=\"createBatchModal\"]/div/div/div[3]/button";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement buttonImportClose() {
		String xpath = "//*[@id=\"importBatchModal\"]/div/div/div[3]/button";
		return driver.findElement(By.xpath(xpath));
	}

	public WebElement modal() {
		String xpath = "//*[@id=\"createBatchModal\"]";
		return driver.findElement(By.xpath(xpath));
	}
}
