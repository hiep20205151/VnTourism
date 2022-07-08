package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class MilitaryWarMuseum extends VnTourismTopic {
	public MilitaryWarMuseum() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq",
				"dbc:Military_and_war_museums_in_Vietnam"));
	}
}