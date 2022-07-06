package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class RoadBridge extends VnTourismTopic{
	public RoadBridge() {
		super();
		this.setTopic(this.getClass().getSimpleName());
		this.setInput(insert(copyFile(new File("request.rq"), new File("request\\"+this.getTopic() +".rq")), "dbc:Road_bridges_in_Vietnam"));
		this.setOutput(getFolder() +"\\" + this.getTopic() + ".ttl");
	}
}