package topic;

import java.io.File;

public class BotanicalGardens extends Topic{
	String topic = "BotanicalGardens";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Botanical_gardens_in_Vietnam");
	public BotanicalGardens() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}