package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class Zoo extends VnTourismTopic {
	public Zoo() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Zoos_in_Vietnam"));
	}
}