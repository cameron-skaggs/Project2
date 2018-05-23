package com.revature.pom;

import org.openqa.selenium.WebDriver;

public abstract class Pom {
	public WebDriver driver;
	public Pom(WebDriver driver) {
		this.driver = driver;
	}
	
	public String title() {
		return this.driver.getTitle();
	}
}
