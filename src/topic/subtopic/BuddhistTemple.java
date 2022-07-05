package topic.subtopic;

import java.io.File;

import topic.Topic;

public class BuddhistTemple extends Topic{
	String topic = "BuddhistTemples";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Buddhist_temples_in_Vietnam");
	public BuddhistTemple() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}