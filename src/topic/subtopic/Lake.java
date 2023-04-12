package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class Lake extends VnTourismTopic {
	public Lake() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Lakes_of_Vietnam"));
	}
}