package query;

import topic.VnTourismTopic;

public interface Query {
	abstract void printTopic();

	abstract String readInput(String inputFile);

	abstract void processQuery();

	abstract void add(VnTourismTopic topic);
	
	abstract void printTime();
	
	abstract void printNumData();

}
