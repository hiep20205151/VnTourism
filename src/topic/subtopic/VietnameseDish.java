package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class VietnameseDish extends VnTourismTopic {
	public VietnameseDish() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbr:List_of_Vietnamese_dishes"));
	}
}