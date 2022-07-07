package topic;

public class VnTourismTopic {
	private String input;
	private String output;
	private String requestsFolder = "requests";
	private String resultsFolder = "results";
	private String topic = this.getClass().getSimpleName();

	public String getRequestsFolder() {
		return requestsFolder;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getResultsFolder() {
		return resultsFolder;
	}

	public void setResultsFolder(String folder) {
		this.resultsFolder = folder;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
}
