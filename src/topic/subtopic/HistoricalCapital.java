package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class HistoricalCapital extends VnTourismTopic {
	public HistoricalCapital() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", 
				"dbr:List_of_historical_capitals_of_Vietnam"));
	}
}
