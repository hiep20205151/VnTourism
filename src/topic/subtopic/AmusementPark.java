package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class AmusementPark extends VnTourismTopic {
	public AmusementPark() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Amusement_parks_in_Vietnam"));
	}
}