package topic.subtopic;

import java.io.File;

import topic.Topic;

public class BotanicalGarden extends Topic{
	String topic = "BotanicalGarden";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Botanical_gardens_in_Vietnam");
	public BotanicalGarden() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
	public void printNotification() {
		System.out.println("Output file creaed: " + topic + ".ttl");
	}
}