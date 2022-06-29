package topic;

import java.io.File;

public class ClockTowers extends Topic{
	String topic = "ClockTowers";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Clock_towers_in_Vietnam");
	public ClockTowers() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}