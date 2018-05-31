package listener;

import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.IInvokedMethodListener;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.IInvokedMethod;

public class Listener implements IInvokedMethodListener, ITestListener, ISuiteListener {	
	@Override
	public void onStart(ISuite arg0) {
	}

	@Override
	public void onFinish(ISuite arg0) {
	}

	public void onStart(ITestContext arg0) {
	}

	public void onFinish(ITestContext arg0) {
	}

	public void onTestSuccess(ITestResult arg0) {
	}

	public void onTestFailure(ITestResult arg0) {
	}

	public void onTestStart(ITestResult arg0) {
	}

	public void onTestSkipped(ITestResult arg0) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {}


	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
	}


	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
	}
}
