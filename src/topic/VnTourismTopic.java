package topic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.Scanner;

import org.apache.jena.query.ParameterizedSparqlString;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.rdf.model.Model;


public class VnTourismTopic implements Topic2{
	private String input;
	private String output;
	private String fileRequest;
	public String getFileRequest() {
		return fileRequest;
	}

	public void setFileRequest(String fileRequest) {
		this.fileRequest = fileRequest;
	}

	private String folder = "results";
	private String topic;
	
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}
	
	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
	
	@Override
	public void printNotification() {
		System.out.println("Output file created: " + output);
	}
	@Override
	public String readInput(String inputFile) {
		FileReader file = null;
		try {
			file = new FileReader(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(file);
		StringBuffer sb = new StringBuffer();
		while (true) {
			String line = null;
			try {
				line = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (line == null)
				break;
			
			sb.append(line).append("\n");
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	@Override
	public void query(String input, String output) {
		ParameterizedSparqlString qs = new ParameterizedSparqlString(input);

		QueryExecution exec = QueryExecution.service("http://dbpedia.org/sparql", qs.asQuery());
		Model m = exec.execConstruct();
		OutputStream outStream;
		try {
			outStream = new FileOutputStream(output, false);
			m.write(outStream, "Turtle");
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	public static String insert(String filePath, String topic){
		Scanner sc;
		try {
			sc= new Scanner(new File(filePath));
		} catch (FileNotFoundException e) {
			return "";
		}
		// instantiating the StringBuffer class
		StringBuffer buffer = new StringBuffer();
		// Reading lines of the file and appending them to StringBuffer
		while (sc.hasNextLine()) {
			buffer.append(sc.nextLine() + System.lineSeparator());
		}
		String fileContents = buffer.toString();
		// closing the Scanner object
		sc.close();
		String oldLine = "#####";
		String newLine = topic;
		// Replacing the old line with new line
		fileContents = fileContents.replaceAll(oldLine, newLine);
		// instantiating the FileWriter class
		FileWriter writer;
		try {
			writer = new FileWriter(filePath);
			writer.append(fileContents);
			writer.flush();
			writer.close();
			return fileContents;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public String copyFile(File source, File dest){
	    try {
			Files.copy(source.toPath(), dest.toPath());
		} catch (IOException e) {
		}
		return dest.toString();
	}
	
}
