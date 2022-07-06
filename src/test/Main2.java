package test;
import topic.VnTourismTopic;
import topic.subtopic.Beach2;

import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<VnTourismTopic> topics = new ArrayList<VnTourismTopic>();
		VnTourismTopic beach = new Beach2();
		topics.add(beach);
		
		for(VnTourismTopic topic : topics) {
			topic.query(topic.getInput(), topic.getOutput());
			topic.printNotification();
		}
		System.out.println("Done!");
	}
}
