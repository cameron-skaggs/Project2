package model;

import java.util.HashMap;
import java.util.Map;

public class TestResult {
	private Map<String, MethodResult> methodResult;
	
	public TestResult() {
		super();
		methodResult = new HashMap<String, MethodResult>();
	}
	
	public Map<String, MethodResult> getMethodResult() {
		return methodResult;
	}

	public void setMethodResult(Map<String, MethodResult> methodResult) {
		this.methodResult = methodResult;
	}

	public void putMethodResult(String key, MethodResult value) {
		methodResult.put(key, value);
	}

	@Override
	public String toString() {
		return "TestResult [methodResult=" + methodResult + "]";
	}
}
