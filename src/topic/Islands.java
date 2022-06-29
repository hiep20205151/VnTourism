package topic;

import java.io.File;

public class Islands extends Topic{
	String topic = "Islands";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbr:List_of_islands_of_Vietnam");
	public Islands() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}