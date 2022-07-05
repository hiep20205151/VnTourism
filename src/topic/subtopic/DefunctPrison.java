package topic.subtopic;

import java.io.File;

import topic.Topic;

public class DefunctPrison extends Topic {
	String topic = "DefunctPrisons";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic + ".rq"));
	public String fileContent = insert(fileRequest, "dbc:Defunct_prisons_in_Vietnam");

	public DefunctPrison() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}