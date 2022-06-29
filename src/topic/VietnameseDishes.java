package topic;

import java.io.File;

public class VietnameseDishes extends Topic{
	String topic = "VietnameseDishes";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbr:List_of_Vietnamese_dishes");
	public VietnameseDishes() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}