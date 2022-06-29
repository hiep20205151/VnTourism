package topic;

import java.io.File;

public class Rivers extends Topic{
	String topic = "Rivers";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Rivers_of_Vietnam");
	public Rivers() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}