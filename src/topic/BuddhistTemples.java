package topic;

import java.io.File;

public class BuddhistTemples extends Topic{
	String topic = "BuddhistTemples";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Buddhist_temples_in_Vietnam");
	public BuddhistTemples() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}