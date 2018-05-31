package result;

import org.testng.IInvokedMethod;
import org.testng.ITestResult;

public class ResultMethod extends AbstractTestResult{
	private IInvokedMethod iInvokedMethod;
	
	public ResultMethod() {}
	
	public ResultMethod(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
		super();
		this.setiInvokedMethod(iInvokedMethod);
		super.setiTestResult(iTestResult);
	}
	
	public IInvokedMethod getiInvokedMethod() {
		return iInvokedMethod;
	}

	public void setiInvokedMethod(IInvokedMethod iInvokedMethod) {
		this.iInvokedMethod = iInvokedMethod;
	}

	@Override
	public String toString() {
		return "ResultMethod [getName()=" + getName() + ", getStatus()=" + getStatus() + ", getTestName()="
				+ getTestName() + "]";
	}
}
