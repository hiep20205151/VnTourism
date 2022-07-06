package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class AmusementPark extends VnTourismTopic{
	public AmusementPark() {
		super();
		this.setTopic(this.getClass().getSimpleName());
		this.setInput(insert(copyFile(new File("request.rq"), new File("request\\"+this.getTopic() +".rq")), "dbc:Amusement_parks_in_Vietnam"));
		this.setOutput(getFolder() +"\\" + this.getTopic() + ".ttl");
	}
}