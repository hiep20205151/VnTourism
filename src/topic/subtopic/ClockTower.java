package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class ClockTower extends VnTourismTopic{
	public ClockTower() {
		super();
		this.setInput(insert(copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:Clock_towers_in_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}