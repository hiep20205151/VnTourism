package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class Mausoleum extends VnTourismTopic{
	public Mausoleum() {
		super();
		this.setInput(insert(copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:Mausoleums_in_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}