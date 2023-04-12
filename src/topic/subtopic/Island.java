package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class Island extends VnTourismTopic {
	public Island() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbr:List_of_islands_of_Vietnam"));
	}
}