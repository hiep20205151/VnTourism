package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class HistoricalSite extends VnTourismTopic {
	public HistoricalSite() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Historical_sites_in_Hanoi"));
	}
}