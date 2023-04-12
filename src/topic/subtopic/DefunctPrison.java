package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class DefunctPrison extends VnTourismTopic {
	public DefunctPrison() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Defunct_prisons_in_Vietnam"));
	}
}