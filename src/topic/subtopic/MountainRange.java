package topic.subtopic;

import java.io.File;

import query.QueryData;
import topic.VnTourismTopic;

public class MountainRange extends VnTourismTopic{
	public MountainRange() {
		super();
		this.setInput(QueryData.insert(QueryData.copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:Mountain_ranges_of_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}