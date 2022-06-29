package topic;

import java.io.File;

public class HistoricalSites extends Topic{
	String topic = "HistoricalSites";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Historical_sites_in_Hanoi");
	public HistoricalSites() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}