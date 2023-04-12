package topic.subtopic;

import query.QueryData;
import topic.VnTourismTopic;

public class Volcano extends VnTourismTopic {

	public Volcano() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() + ".rq",
		        "dbc:Volcanoes_of_Vietnam\ndbr:List_of_volcanoes_in_Vietnam"));
	}
}