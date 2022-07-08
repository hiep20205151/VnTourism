package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class Beach extends VnTourismTopic {

	public Beach() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Beaches_of_Vietnam"));
	}
}