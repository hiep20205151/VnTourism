package topic.subtopic;

import java.io.File;

import query.QueryData;
import topic.VnTourismTopic;

public class Island extends VnTourismTopic{
	public Island() {
		super();
		this.setInput(QueryData.insert(QueryData.copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbr:List_of_islands_of_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}