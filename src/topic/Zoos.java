package topic;

import java.io.File;

public class Zoos extends Topic{
	String topic = "Zoos";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Zoos_in_Vietnam");
	public Zoos() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}