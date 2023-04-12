package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class Cave extends VnTourismTopic {

	public Cave() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq",
		        "dbc:Caves_of_Vietnam\ndbc:Show_caves_in_Vietnam"));
	}
}