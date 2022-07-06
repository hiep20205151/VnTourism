package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class Museum extends VnTourismTopic{
	public Museum() {
		super();
		this.setInput(insert(copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:Museums_in_Hanoi"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}