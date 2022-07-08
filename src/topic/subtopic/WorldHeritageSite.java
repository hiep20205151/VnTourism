package topic.subtopic;

import java.io.File;

import query.QueryData;
import topic.VnTourismTopic;

public class WorldHeritageSite extends VnTourismTopic{
	public WorldHeritageSite() {
		super();
		this.setInputFile(QueryData.createRequestFile(this.getTopic() +".rq", "dbc:World_Heritage_Sites_in_Vietnam"));
	}
}