package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class Island extends VnTourismTopic{
	public Island() {
		super();
		this.setTopic(this.getClass().getSimpleName());
		this.setInput(insert(copyFile(new File("request.rq"), new File("request\\"+this.getTopic() +".rq")), "dbr:List_of_islands_of_Vietnam"));
		this.setOutput(getFolder() +"\\" + this.getTopic() + ".ttl");
	}
}