package topic.subtopic;

import java.io.File;

import topic.Topic;

public class MilitaryWarMuseum extends Topic{
	String topic = "MilitaryWarMuseums";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Military_and_war_museums_in_Vietnam");
	public MilitaryWarMuseum() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}