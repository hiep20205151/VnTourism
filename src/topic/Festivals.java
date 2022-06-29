package topic;

import java.io.File;

public class Festivals extends Topic{
	String topic = "Festivals";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Festivals_in_Vietnam");
	public Festivals() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}