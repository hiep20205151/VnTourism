package topic.subtopic;

import java.io.File;

import query.QueryData;
import topic.VnTourismTopic;

public class WaterFall extends VnTourismTopic{
	public WaterFall() {
		super();
		this.setInput(QueryData.insert(QueryData.copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:Waterfalls_of_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}