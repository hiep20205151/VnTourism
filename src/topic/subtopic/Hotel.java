package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class Hotel extends VnTourismTopic {
	public Hotel() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Hotels_in_Vietnam"));
	}
}