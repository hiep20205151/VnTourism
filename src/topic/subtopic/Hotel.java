package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class Hotel extends VnTourismTopic{
	public Hotel() {
		super();
		this.setTopic(this.getClass().getSimpleName());
		this.setInput(insert(copyFile(new File("request.rq"), new File("request\\"+this.getTopic() +".rq")), "dbc:Hotels_in_Vietnam"));
		this.setOutput(getFolder() +"\\" + this.getTopic() + ".ttl");
	}
}