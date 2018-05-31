package result;

import org.testng.ITestResult;

public abstract class AbstractTestResult {
	private ITestResult iTestResult;
	private long endMillis;
	private String name;
	private long startMillis;
	private String status;
	private String testName;
	
	public void setiTestResult(ITestResult iTestResult) {
		this.iTestResult = iTestResult;
		this.endMillis = iTestResult.getEndMillis();
		this.name = iTestResult.getName();
		this.startMillis = iTestResult.getStartMillis();
		this.testName = iTestResult.getTestName();
		
		int status = iTestResult.getStatus();
		this.status = stringifyStatus(status);
	}
	
	private String stringifyStatus(int integer) {
		switch(integer) {
		case 2:
			return "FAILURE";
		case 3:
			return "SKIP";
		case 16:
			return "STARTED";
		case 1:
			return "SUCCESS";
		case 4:
			return "SUCCESS PERCENTAGE FAILURE";
		default:
			return "";
		}
	}

	public long getEndMillis() {
		return endMillis;
	}

	public void setEndMillis(long endMillis) {
		this.endMillis = endMillis;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getStartMillis() {
		return startMillis;
	}

	public void setStartMillis(long startMillis) {
		this.startMillis = startMillis;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public ITestResult getiTestResult() {
		return iTestResult;
	}
}
