package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class Tomb extends VnTourismTopic {
	public Tomb() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Tombs_in_Vietnam"));
	}
}