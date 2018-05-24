package driver;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements Driver{
	@Override
	public WebDriver get() {
		File file = new File("src/main/resources/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		return new FirefoxDriver();
	}
}
