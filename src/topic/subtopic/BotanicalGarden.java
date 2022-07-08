package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class BotanicalGarden extends VnTourismTopic {
	
	public BotanicalGarden() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq", "dbc:Botanical_gardens_in_Vietnam"));
	}
}