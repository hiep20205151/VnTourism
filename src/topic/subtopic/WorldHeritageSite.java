package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class WorldHeritageSite extends VnTourismTopic{
	public WorldHeritageSite() {
		super();
		this.setInput(insert(copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbc:World_Heritage_Sites_in_Vietnam"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}