package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class OperaHouse extends VnTourismTopic{
	public OperaHouse() {
		super();
		this.setInput(insert(copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:Opera_houses_in_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}