package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class HistoricalSite extends VnTourismTopic{
	public HistoricalSite() {
		super();
		this.setTopic(this.getClass().getSimpleName());
		this.setInput(insert(copyFile(new File("request.rq"), new File("request\\"+this.getTopic() +".rq")), "dbc:Historical_sites_in_Hanoi"));
		this.setOutput(getFolder() +"\\" + this.getTopic() + ".ttl");
	}
}