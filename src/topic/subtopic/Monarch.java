package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class Monarch extends VnTourismTopic {
	public Monarch() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbr:List_of_monarchs_of_Vietnam"));
	}
}