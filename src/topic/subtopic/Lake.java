package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class Lake extends VnTourismTopic{
	public Lake() {
		super();
		this.setInput(insert(copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:Lakes_of_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}