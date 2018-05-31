package result;

import org.testng.ITestNGMethod;

public abstract class AbstractInvokedMethod extends AbstractTestResult{
	private ITestNGMethod iTestNgMethod;
	
	private String description;
	private String methodName;

	public ITestNGMethod getiTestNgMethod() {
		return iTestNgMethod;
	}

	public void setiTestNgMethod(ITestNGMethod iTestNgMethod) {
		this.iTestNgMethod = iTestNgMethod;
	}
	
}
