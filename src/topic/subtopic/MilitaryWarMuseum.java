package topic.subtopic;

import java.io.File;

import query.QueryData;
import topic.VnTourismTopic;

public class MilitaryWarMuseum extends VnTourismTopic{
	public MilitaryWarMuseum() {
		super();
		this.setInput(QueryData.insert(QueryData.copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:Military_and_war_museums_in_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}