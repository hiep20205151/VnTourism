package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class BuddhistTemple extends VnTourismTopic{
	public BuddhistTemple() {
		super();
		this.setInput(insert(copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:Buddhist_temples_in_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}