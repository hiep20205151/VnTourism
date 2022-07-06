package topic.subtopic;

import java.io.File;

import topic.Topic;

public class Museum extends Topic{
	String topic = "Museum";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Museums_in_Hanoi");
	public Museum() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
	public void printNotification() {
		System.out.println("Output file creaed: " + topic + ".ttl");
	}
}