package topic;

import java.io.File;

public class WaterFalls extends Topic{
	String topic = "WaterFalls";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Waterfalls_of_Vietnam");
	public WaterFalls() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}