package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class HistoricalSite extends VnTourismTopic{
	public HistoricalSite() {
		super();
		this.setInput(insert(copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:Historical_sites_in_Hanoi"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}