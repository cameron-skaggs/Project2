package listener;

import java.util.ArrayList;
import java.util.List;

public class TestResult {
	private List<Long> millis;
	private List<String> names;
	private List<String> statuses;
	
	public TestResult() {
		this.millis = new ArrayList<>();
		this.names = new ArrayList<>();
		this.statuses = new ArrayList<>();
	}

	public List<Long> getMillis() {
		return millis;
	}

	public void setMillis(List<Long> millis) {
		this.millis = millis;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public List<String> getStatuses() {
		return statuses;
	}

	public void setStatuses(List<String> statuses) {
		this.statuses = statuses;
	}

	public void setMilli(long start, long end) {
		Long milli = new Long( end - start );
		this.millis.add(milli);
	}
	
	public void setName(String name) {
		this.names.add(name);
	}

	public void setStatus(int status) {
		switch(status) {
		case 2:
			this.statuses.add("failure");
			break;
		case 3:
			this.statuses.add("skipped");
			break;
		case 16:
			this.statuses.add("started");
			break;
		case 1:
			this.statuses.add("success");
			break;
		case 4:
			this.statuses.add("success percentage failure");
			break;
		default:
			this.statuses.add("TestResult#setStatus failure");
		}
	}

	@Override
	public String toString() {
		return "TestResult [millis=" + millis + ", names=" + names + ", statuses=" + statuses + "]";
	}
}
