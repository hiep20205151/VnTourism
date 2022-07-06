package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class Festival extends VnTourismTopic{
	public Festival() {
		super();
		this.setTopic(this.getClass().getSimpleName());
		this.setInput(insert(copyFile(new File("request.rq"), new File("request\\"+this.getTopic() +".rq")), "dbc:Festivals_in_Vietnam"));
		this.setOutput(getFolder() +"\\" + this.getTopic() + ".ttl");
	}
}