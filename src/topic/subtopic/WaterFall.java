package topic.subtopic;

import java.io.File;

import topic.Topic;

public class WaterFall extends Topic{
	String topic = "WaterFall";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Waterfalls_of_Vietnam");
	public WaterFall() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
	public void printNotification() {
		System.out.println("Output file creaed: " + topic + ".ttl");
	}
}