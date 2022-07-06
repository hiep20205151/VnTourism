package topic.subtopic;

import java.io.File;

import topic.Topic;

public class Festival extends Topic{
	String topic = "Festival";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Festivals_in_Vietnam");
	public Festival() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
	public void printNotification() {
		System.out.println("Output file creaed: " + topic + ".ttl");
	}
}