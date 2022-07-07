package topic.subtopic;

import java.io.File;

import query.QueryData;
import topic.VnTourismTopic;

public class DefunctPrison extends VnTourismTopic{
	public DefunctPrison() {
		super();
		this.setInput(QueryData.insert(QueryData.copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:Defunct_prisons_in_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}