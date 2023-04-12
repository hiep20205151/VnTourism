package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class RoadBridge extends VnTourismTopic {
	public RoadBridge() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Road_bridges_in_Vietnam"));
	}
}