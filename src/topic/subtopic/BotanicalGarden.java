package topic.subtopic;

import java.io.File;

import query.QueryData;
import topic.VnTourismTopic;

public class BotanicalGarden extends VnTourismTopic{
	public BotanicalGarden() {
		super();
		this.setInput(QueryData.insert(QueryData.copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:Botanical_gardens_in_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}