package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class VietnameseDish extends VnTourismTopic{
	public VietnameseDish() {
		super();
		this.setTopic(this.getClass().getSimpleName());
		this.setInput(insert(copyFile(new File("request.rq"), new File("request\\"+this.getTopic() +".rq")), "dbr:List_of_Vietnamese_dishes"));
		this.setOutput(getFolder() +"\\" + this.getTopic() + ".ttl");
	}
}