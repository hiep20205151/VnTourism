package topic.subtopic;

import java.io.File;

import topic.Topic;

public class MountainRange extends Topic{
	String topic = "MountainRanges";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Mountain_ranges_of_Vietnam");
	public MountainRange() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}