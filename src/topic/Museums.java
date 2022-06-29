package topic;

import java.io.File;

public class Museums extends Topic{
	String topic = "Museums";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Museums_in_Hanoi");
	public Museums() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}