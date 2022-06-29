package topic;

import java.io.File;

public class Beaches extends Topic{
	String topic = "Beaches";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Beaches_of_Vietnam");
	public Beaches() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}