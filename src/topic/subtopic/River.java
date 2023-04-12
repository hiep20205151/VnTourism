package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class River extends VnTourismTopic {
	public River() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Rivers_of_Vietnam"));
	}
}