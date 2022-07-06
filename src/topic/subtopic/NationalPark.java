package topic.subtopic;

import java.io.File;

import topic.Topic;

public class NationalPark extends Topic{
	String topic = "NationalPark";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbr:List_of_national_parks_of_Vietnam");
	public NationalPark() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
	public void printNotification() {
		System.out.println("Output file creaed: " + topic + ".ttl");
	}
}