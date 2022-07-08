package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class ArchaeologicalSite extends VnTourismTopic {
	public ArchaeologicalSite() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Archaeological_sites_in_Vietnam"));
	}
}