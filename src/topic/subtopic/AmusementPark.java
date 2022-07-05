package topic.subtopic;

import java.io.File;

import topic.Topic;

public class AmusementPark extends Topic{
	String topic = "AmusementParks";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Amusement_parks_in_Vietnam");
	public AmusementPark() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}