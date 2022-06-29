package topic;

import java.io.File;

public class OperaHouses extends Topic{
	String topic = "OperaHouses";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Opera_houses_in_Vietnam");
	public OperaHouses() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}