package topic.subtopic;

import java.io.File;

import query.QueryData;
import topic.VnTourismTopic;

public class Beach extends VnTourismTopic{
	
	public Beach() {
		super();
		this.setInput(QueryData.insert(QueryData.copyFile(new File("request.rq"), new File(getRequestsFolder()+"\\"+this.getTopic() +".rq")), "dbc:Beaches_of_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}