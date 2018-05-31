package model;

import java.util.HashMap;
import java.util.Map;

public class TestNgResult {
	Map<String, SuiteResult> testNgResult;

	public TestNgResult() {
		testNgResult = new HashMap<String, SuiteResult>();
	}
	
	public Map<String, SuiteResult> getTestNgResult() {
		return testNgResult;
	}

	public void setTestNgResult(Map<String, SuiteResult> testNgResult) {
		this.testNgResult = testNgResult;
	}
	
	public void putSuiteResult(String key, SuiteResult value) {
		testNgResult.put(key, value);
	}

	@Override
	public String toString() {
		return "TestNgResult [testNgResult=" + testNgResult + "]";
	}
	

}
