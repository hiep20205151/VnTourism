package topic.subtopic;

import java.io.File;

import query.QueryData;
import topic.VnTourismTopic;

public class AmusementPark extends VnTourismTopic{
	public AmusementPark() {
		super();
		this.setInput(QueryData.insert(QueryData.copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:Amusement_parks_in_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}