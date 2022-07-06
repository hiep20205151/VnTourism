package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class VietnameseDish extends VnTourismTopic{
	public VietnameseDish() {
		super();
		this.setInput(insert(copyFile(new File("request.rq"), new File("requests\\"+this.getTopic() +".rq")), "dbr:List_of_Vietnamese_dishes"));
		this.setOutput(getResultsFolder() +"\\" + this.getTopic() + ".ttl");
	}
}