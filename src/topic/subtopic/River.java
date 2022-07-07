package topic.subtopic;

import java.io.File;

import query.QueryData;
import topic.VnTourismTopic;

public class River extends VnTourismTopic{
	public River() {
		super();
		this.setInput(QueryData.insert(QueryData.copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:Rivers_of_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}