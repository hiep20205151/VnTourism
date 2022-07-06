package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class Hotel extends VnTourismTopic{
	public Hotel() {
		super();
		this.setInput(insert(copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:Hotels_in_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}