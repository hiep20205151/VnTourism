package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class Mausoleum extends VnTourismTopic{
	public Mausoleum() {
		super();
		this.setTopic(this.getClass().getSimpleName());
		this.setInput(insert(copyFile(new File("request.rq"), new File("request\\"+this.getTopic() +".rq")), "dbc:Mausoleums_in_Vietnam"));
		this.setOutput(getFolder() +"\\" + this.getTopic() + ".ttl");
	}
}