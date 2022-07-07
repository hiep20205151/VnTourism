package topic.subtopic;

import java.io.File;

import query.QueryData;
import topic.VnTourismTopic;

public class RoadBridge extends VnTourismTopic{
	public RoadBridge() {
		super();
		this.setInput(QueryData.insert(QueryData.copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:Road_bridges_in_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}