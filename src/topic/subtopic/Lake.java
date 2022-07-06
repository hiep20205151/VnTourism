package topic.subtopic;

import java.io.File;

import topic.Topic;

public class Lake extends Topic{
	String topic = "Lake";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Lakes_of_Vietnam");
	public Lake() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
	public void printNotification() {
		System.out.println("Output file creaed: " + topic + ".ttl");
	}
}
