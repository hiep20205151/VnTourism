package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class Museum extends VnTourismTopic{
	public Museum() {
		super();
		this.setTopic(this.getClass().getSimpleName());
		this.setInput(insert(copyFile(new File("request.rq"), new File("request\\"+this.getTopic() +".rq")), "dbc:Museums_in_Hanoi"));
		this.setOutput(getFolder() +"\\" + this.getTopic() + ".ttl");
	}
}