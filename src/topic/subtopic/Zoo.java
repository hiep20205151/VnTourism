package topic.subtopic;

import java.io.File;

import topic.Topic;

public class Zoo extends Topic{
	String topic = "Zoo";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Zoos_in_Vietnam");
	public Zoo() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
	public void printNotification() {
		System.out.println("Output file creaed: " + topic + ".ttl");
	}
}