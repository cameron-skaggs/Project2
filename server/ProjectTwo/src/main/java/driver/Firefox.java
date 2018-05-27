package driver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements Driver{
	@Override
	public WebDriver get() {
		File file = new File("src/main/resources/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		return driver;
	}
}
