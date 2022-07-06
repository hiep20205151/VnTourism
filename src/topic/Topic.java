package topic;

public interface Topic {
	
	abstract String readInput(String inputFile);

	abstract void query(String input, String output);
	
	abstract void printNotification();

}
