package topic.subtopic;

import java.io.File;

import topic.Topic;

public class Mausoleum extends Topic{
	String topic = "Mausoleums";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Mausoleums_in_Vietnam");
	public Mausoleum() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}