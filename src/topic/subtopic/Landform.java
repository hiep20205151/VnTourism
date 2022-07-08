package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class Landform extends VnTourismTopic {
	public Landform() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() +".rq", "dbc:Lists_of_landforms_of_Vietnam"));
	}
}