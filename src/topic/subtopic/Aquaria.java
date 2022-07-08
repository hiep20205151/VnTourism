package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class Aquaria extends VnTourismTopic {

	public Aquaria() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Aquaria_in_Vietnam"));
	}
}