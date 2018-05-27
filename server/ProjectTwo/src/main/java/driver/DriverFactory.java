package driver;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	private DriverFactory() {}
	public static WebDriver get(String type) {
		Driver driver = null;
		switch(type) {
		case "firefox":
			driver = new Firefox();
			return driver.get();
		case "chrome":
			driver = new Chrome();
			return driver.get();
		default:
			throw new IllegalArgumentException("DriverFactory#get " + type);
		}
	}
}
