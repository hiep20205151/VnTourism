package topic.subtopic;

import java.io.File;

import topic.VnTourismTopic;

public class Beach2 extends VnTourismTopic{
	public Beach2() {
		super();
		this.setTopic("Beach");
		this.setFileRequest(copyFile(new File("request.rq"), new File(this.getTopic() +".rq")));
		this.setInput(insert(this.getFileRequest(), "dbc:Beaches_of_Vietnam"));
		this.setOutput(getFolder() +"\\" + this.getTopic() + ".ttl");
	}
}