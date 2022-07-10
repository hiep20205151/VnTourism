package topic;

public class VnTourismTopic {

	private String topic = this.getClass().getSimpleName();
	private String inputFolder = "requests";
	private String outputFolder = "results";
	private String outputFile = outputFolder + "\\" + topic + ".txt";
	private String inputFile;

	public String getInputFolder() {
		return inputFolder;
	}

	public void setInputFolder(String inputFolder) {
		this.inputFolder = inputFolder;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getOutputFolder() {
		return outputFolder;
	}

	public void setOutputFolder(String folder) {
		this.outputFolder = folder;
	}

	public String getInputFile() {
		return inputFile;
	}

	public void setInputFile(String input) {
		this.inputFile = input;
	}

	public String getOutputFile() {
		return outputFile;
	}

	public void setOutputFile(String output) {
		this.outputFile = output;
	}
}
