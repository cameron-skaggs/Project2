package listener;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;

import model.MethodResult;
import model.SuiteResult;
import model.TestNgResult;
import model.TestResult;

public class Listener implements ITestListener, ISuiteListener, IInvokedMethodListener {
	TestNgResult testNgResult = new TestNgResult();
	SuiteResult suiteResult;
	TestResult testResult;
	MethodResult methodResult;
	
	@Override
	public void onStart(ISuite arg0) {
		suiteResult = new SuiteResult();
	}

	@Override
	public void onFinish(ISuite arg0) {
		String key = arg0.getName();
		testNgResult.putSuiteResult(key, suiteResult); 
		System.out.println(testNgResult); //<== debug printing
	}

	public void onStart(ITestContext arg0) {
		testResult = new TestResult();
	}

	public void onFinish(ITestContext arg0) {
		String key = arg0.getName();
		suiteResult.putTestResult(key, testResult);
	}

	public void onTestSuccess(ITestResult arg0) {
		printTestResults(arg0);
	}

	public void onTestFailure(ITestResult arg0) {
		printTestResults(arg0);
	}

	public void onTestStart(ITestResult arg0) {
		testResult = new TestResult();
	}

	public void onTestSkipped(ITestResult arg0) {
		printTestResults(arg0);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {}

	private void printTestResults(ITestResult result) {
		String name = result.getTestClass().getName();
		
		
		if (result.getParameters().length != 0) {
			String params = null;

			for (Object parameter : result.getParameters()) {
				params += parameter.toString() + ",";
			}

		}

		String status = null;

		switch (result.getStatus()) {
		case ITestResult.SUCCESS:
			status = "Pass";
			break;
		case ITestResult.FAILURE:
			status = "Failed";
			break;
		case ITestResult.SKIP:
			status = "Skipped";
		}

		suiteResult.putTestResult(name, testResult);
		testResult = new TestResult();
	}

	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		String name = returnMethodName(arg0.getTestMethod());
		methodResult = new MethodResult();
		methodResult.setName(name);
	}


	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		String key = returnMethodName( arg0.getTestMethod() );
		String status = Integer.toString( arg1.getStatus() );
		methodResult.setStatus(status);
		testResult.putMethodResult(key, methodResult);
	}

	private String returnMethodName(ITestNGMethod method) {
		return method.getRealClass().getSimpleName() + "." + method.getMethodName();
	}
}
