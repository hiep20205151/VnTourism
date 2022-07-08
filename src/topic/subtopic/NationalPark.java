package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class NationalPark extends VnTourismTopic {
	public NationalPark() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() +".rq", "dbr:List_of_national_parks_of_Vietnam"));
	}
}