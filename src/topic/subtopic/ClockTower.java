package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class ClockTower extends VnTourismTopic{
	public ClockTower() {
		super();
		this.setTopic(this.getClass().getSimpleName());
		this.setInput(insert(copyFile(new File("request.rq"), new File("request\\"+this.getTopic() +".rq")), "dbc:Clock_towers_in_Vietnam"));
		this.setOutput(getFolder() +"\\" + this.getTopic() + ".ttl");
	}
}