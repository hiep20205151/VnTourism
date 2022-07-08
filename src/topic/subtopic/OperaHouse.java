package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class OperaHouse extends VnTourismTopic {
	public OperaHouse() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Opera_houses_in_Vietnam"));
	}
}