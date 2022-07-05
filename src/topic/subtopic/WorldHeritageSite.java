package topic.subtopic;

import java.io.File;

import topic.Topic;

public class WorldHeritageSite extends Topic{
	String topic = "WorldHeritageSites";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:World_Heritage_Sites_in_Vietnam");
	public WorldHeritageSite() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}