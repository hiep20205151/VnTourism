package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class Zoo extends VnTourismTopic{
	public Zoo() {
		super();
		this.setInput(insert(copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:Zoos_in_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}