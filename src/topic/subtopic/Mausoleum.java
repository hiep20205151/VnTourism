package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class Mausoleum extends VnTourismTopic {
	public Mausoleum() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Mausoleums_in_Vietnam"));
	}
}