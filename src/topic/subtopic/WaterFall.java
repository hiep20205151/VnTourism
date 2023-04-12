package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class WaterFall extends VnTourismTopic {
	public WaterFall() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Waterfalls_of_Vietnam"));
	}
}