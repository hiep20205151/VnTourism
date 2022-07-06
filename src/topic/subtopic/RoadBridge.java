package topic.subtopic;

import java.io.File;

import topic.Topic;

public class RoadBridge extends Topic{
	String topic = "RoadBridge";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Road_bridges_in_Vietnam");
	public RoadBridge() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
	public void printNotification() {
		System.out.println("Output file creaed: " + topic + ".ttl");
	}
}