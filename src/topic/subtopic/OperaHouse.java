package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class OperaHouse extends VnTourismTopic{
	public OperaHouse() {
		super();
		this.setTopic(this.getClass().getSimpleName());
		this.setInput(insert(copyFile(new File("request.rq"), new File("request\\"+this.getTopic() +".rq")), "dbc:Opera_houses_in_Vietnam"));
		this.setOutput(getFolder() +"\\" + this.getTopic() + ".ttl");
	}
}