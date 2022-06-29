package topic;

import java.io.File;

public class RoadBridges extends Topic{
	String topic = "RoadBridges";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Road_bridges_in_Vietnam");
	public RoadBridges() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}