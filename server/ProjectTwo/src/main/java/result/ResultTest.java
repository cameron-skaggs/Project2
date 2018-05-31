package result;

import org.testng.ITestContext;
import org.testng.ITestResult;

public class ResultTest extends AbstractTestResult{
	private ITestContext iTestContext;
	
	public ResultTest() {}
	
	public ResultTest(ITestContext iTestContext, ITestResult iTestResult) {
		super();
		this.setContext(iTestContext);
		super.setiTestResult(iTestResult);
	}

	public ITestContext getContext() {
		return iTestContext;
	}

	public void setContext(ITestContext iTestContext) {
		this.iTestContext = iTestContext;
	}	
}
