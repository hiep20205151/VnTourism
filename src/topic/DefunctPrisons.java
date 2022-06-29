package topic;

import java.io.File;

public class DefunctPrisons extends Topic {
	String topic = "DefunctPrisons";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic + ".rq"));
	public String fileContent = insert(fileRequest, "dbc:Defunct_prisons_in_Vietnam");

	public DefunctPrisons() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}