package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class Museum extends VnTourismTopic {
	public Museum() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Museums_in_Hanoi"));
	}
}