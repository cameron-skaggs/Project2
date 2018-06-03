package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePom extends Pom {
	private static final String URL = "https://dev-caliber.revature.tech/caliber/";

	public HomePom(WebDriver driver) {
		super(driver);
		driver.get(URL);
	}

	public void listNavbar(String string) {
		List<WebElement> list = driver.findElements(By.tagName("li"));
		
		filter(list, string);
	}
	
	public void listSettings(String string) {
		List<WebElement> list = driver.findElements(By.tagName("li"));
		
		filter(list, string);
	}
	
	private void filter(List<WebElement> list, String string) {
		WebElement item = list.stream()
				.filter( element -> element.getText().equals(string))
				.findAny()
				.orElse(null);
		
		item.click();
	}
}