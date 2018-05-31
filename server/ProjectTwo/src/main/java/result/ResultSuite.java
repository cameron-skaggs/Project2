package result;

import org.testng.ISuite;

public class ResultSuite {
	private ISuite suite;
	
	public ResultSuite() {}

	public ISuite getSuite() {
		return suite;
	}

	public void setSuite(ISuite suite) {
		this.suite = suite;
	}
}
