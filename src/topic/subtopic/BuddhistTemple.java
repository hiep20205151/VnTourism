package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class BuddhistTemple extends VnTourismTopic{
	public BuddhistTemple() {
		super();
		this.setTopic(this.getClass().getSimpleName());
		this.setInput(insert(copyFile(new File("request.rq"), new File("request\\"+this.getTopic() +".rq")), "dbc:Buddhist_temples_in_Vietnam"));
		this.setOutput(getFolder() +"\\" + this.getTopic() + ".ttl");
	}
}