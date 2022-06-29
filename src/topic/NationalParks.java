package topic;

import java.io.File;

public class NationalParks extends Topic{
	String topic = "NationalParks";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbr:List_of_national_parks_of_Vietnam");
	public NationalParks() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}