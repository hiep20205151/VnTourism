package topic;

import java.io.File;

public class Mausoleums extends Topic{
	String topic = "Mausoleums";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Mausoleums_in_Vietnam");
	public Mausoleums() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}