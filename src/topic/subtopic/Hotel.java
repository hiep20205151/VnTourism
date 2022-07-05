package topic.subtopic;

import java.io.File;

import topic.Topic;

public class Hotel extends Topic{
	String topic = "Hotels";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Hotels_in_Vietnam");
	public Hotel() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}