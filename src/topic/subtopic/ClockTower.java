package topic.subtopic;

import java.io.File;

import topic.Topic;

public class ClockTower extends Topic{
	String topic = "ClockTowers";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Clock_towers_in_Vietnam");
	public ClockTower() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}