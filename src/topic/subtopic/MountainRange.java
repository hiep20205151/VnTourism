package topic.subtopic;

import java.io.File;

import query.QueryData;
import topic.VnTourismTopic;

public class MountainRange extends VnTourismTopic{
	public MountainRange() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() +".rq", "dbc:Mountain_ranges_of_Vietnam"));
	}
}