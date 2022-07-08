package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class BuddhistTemple extends VnTourismTopic {
	public BuddhistTemple() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Buddhist_temples_in_Vietnam"));
	}
}