package topic.subtopic;

import java.io.File;

import topic.Topic;

public class VietnameseDish extends Topic{
	String topic = "VietnameseDish";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbr:List_of_Vietnamese_dishes");
	public VietnameseDish() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
	public void printNotification() {
		System.out.println("Output file creaed: " + topic + ".ttl");
	}
}