package topic;

import java.io.File;

public class WorldHeritageSites extends Topic{
	String topic = "WorldHeritageSites";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:World_Heritage_Sites_in_Vietnam");
	public WorldHeritageSites() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}