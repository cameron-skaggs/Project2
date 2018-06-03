package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {
	private TestResult testResult;
	
	public TestListener() {
		testResult = new TestResult();
	}
	
	public TestResult getTestResult() {
		return this.testResult;
	}

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		setTestResult(result);	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		setTestResult(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		setTestResult(result);
	}
	
	private void setTestResult(ITestResult result) {
		long start = result.getStartMillis();
		long end = result.getEndMillis();
		testResult.setName(result.getName());
		testResult.setStatus(result.getStatus());
		testResult.setMilli(end, start);
		testResult.setParameters(result.getParameters());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}
}
