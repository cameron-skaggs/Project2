package listener;

import java.util.HashMap;
import java.util.Map;

public class SuiteResult {
	private Map<String, TestResult> suiteResult;
	
	public SuiteResult() {
		suiteResult = new HashMap<String, TestResult>();
	}

	public Map<String, TestResult> getSuiteResult() {
		return suiteResult;
	}

	public void setSuiteResult(Map<String, TestResult> suiteResult) {
		this.suiteResult = suiteResult;
	}
	
	public void putTestResult(String key, TestResult value) {
		suiteResult.put(key, value);
	}

	@Override
	public String toString() {
		return "SuiteResult [suiteResult=" + suiteResult + "]";
	}
}
