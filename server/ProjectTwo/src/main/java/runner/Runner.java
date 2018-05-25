package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = { "src/test/Caliber.feature" },
		glue = { "glue" }
)
public class Runner extends AbstractTestNGCucumberTests {

}
