package topic.subtopic;

import java.io.File;

import topic.Topic;

public class Island extends Topic{
	String topic = "Islands";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbr:List_of_islands_of_Vietnam");
	public Island() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}