package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class Lake extends VnTourismTopic{
	public Lake() {
		super();
		this.setTopic(this.getClass().getSimpleName());
		this.setInput(insert(copyFile(new File("request.rq"), new File("request\\"+this.getTopic() +".rq")), "dbc:Lakes_of_Vietnam"));
		this.setOutput(getFolder() +"\\" + this.getTopic() + ".ttl");
	}
}