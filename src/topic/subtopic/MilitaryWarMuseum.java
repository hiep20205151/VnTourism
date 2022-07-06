package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class MilitaryWarMuseum extends VnTourismTopic{
	public MilitaryWarMuseum() {
		super();
		this.setTopic(this.getClass().getSimpleName());
		this.setInput(insert(copyFile(new File("request.rq"), new File("request\\"+this.getTopic() +".rq")), "dbc:Military_and_war_museums_in_Vietnam"));
		this.setOutput(getFolder() +"\\" + this.getTopic() + ".ttl");
	}
}