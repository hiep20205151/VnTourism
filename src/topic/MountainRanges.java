package topic;

import java.io.File;

public class MountainRanges extends Topic{
	String topic = "MountainRanges";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Mountain_ranges_of_Vietnam");
	public MountainRanges() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}