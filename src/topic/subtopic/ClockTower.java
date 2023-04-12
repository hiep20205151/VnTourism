package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class ClockTower extends VnTourismTopic {
	public ClockTower() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Clock_towers_in_Vietnam"));
	}
}