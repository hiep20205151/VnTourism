package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class Beach extends VnTourismTopic{
	public Beach() {
		super();
		this.setInput(insert(copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:Beaches_of_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}