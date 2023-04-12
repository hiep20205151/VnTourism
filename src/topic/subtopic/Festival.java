package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class Festival extends VnTourismTopic {
	public Festival() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() +".rq", "dbc:Festivals_in_Vietnam"));
	}
}