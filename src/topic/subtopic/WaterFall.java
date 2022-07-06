package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class WaterFall extends VnTourismTopic{
	public WaterFall() {
		super();
		this.setTopic(this.getClass().getSimpleName());
		this.setInput(insert(copyFile(new File("request.rq"), new File("request\\"+this.getTopic() +".rq")), "dbc:Waterfalls_of_Vietnam"));
		this.setOutput(getFolder() +"\\" + this.getTopic() + ".ttl");
	}
}