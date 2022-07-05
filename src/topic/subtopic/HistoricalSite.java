package topic.subtopic;

import java.io.File;

import topic.Topic;

public class HistoricalSite extends Topic{
	String topic = "HistoricalSites";
	public String fileRequest = copyFile(new File("request.rq"), new File(topic +".rq"));
	public String fileContent = insert(fileRequest, "dbc:Historical_sites_in_Hanoi");
	public HistoricalSite() {
		super();
		this.setInput(fileContent);
		this.setOutput(getFolder() +"\\" + topic + ".ttl");
	}
}