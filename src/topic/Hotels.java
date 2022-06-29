package topic;

import java.io.File;

public class Hotels extends Topic{
	String topic = "Hotels";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Hotels_in_Vietnam");
	public Hotels() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}