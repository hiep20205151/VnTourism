package topic;

import java.io.File;

public class AmusementParks extends Topic{
	String topic = "AmusementParks";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Amusement_parks_in_Vietnam");
	public AmusementParks() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}