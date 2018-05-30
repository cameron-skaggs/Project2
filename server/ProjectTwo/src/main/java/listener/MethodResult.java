package listener;

public class MethodResult {
	private String name;
	private String parameters;
	private String status;
	
	public MethodResult() {
		this.name = "";
		this.parameters = "";
		this.status = "";
	}
	
	public MethodResult(String name, String parameters, String status) {
		super();
		this.name = name;
		this.parameters = parameters;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParameters() {
		return parameters;
	}
	public void setParameters(String parameters) {
		this.parameters = parameters;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "MethodResult [name=" + name + ", parameters=" + parameters + ", status=" + status + "]";
	}
}
