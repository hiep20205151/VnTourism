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

public abstract class Topic {
	private String input;
	private String output;
	private String folder = "results";
	

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

	public String readInput(String inputFile) {
		FileReader file = null;
		try {
			file = new FileReader(inputFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(file);
		StringBuffer sb = new StringBuffer();
		while (true) {
			String line = null;
			try {
				line = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (line == null)
				break;
			
			sb.append(line).append("\n");
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	public void query(String input, String output) {
		ParameterizedSparqlString qs = new ParameterizedSparqlString(input);

		QueryExecution exec = QueryExecution.service("http://dbpedia.org/sparql", qs.asQuery());
		Model m = exec.execConstruct();
		OutputStream outStream;
		try {
			outStream = new FileOutputStream(output, false);
			m.write(outStream, "Turtle");
			System.out.println("Output file created: " + output);
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
			// TODO Auto-generated catch block
			return "";
		}
		// instantiating the StringBuffer class
		StringBuffer buffer = new StringBuffer();
		// Reading lines of the file and appending them to StringBuffer
		while (sc.hasNextLine()) {
			buffer.append(sc.nextLine() + System.lineSeparator());
		}
		String fileContents = buffer.toString();
//		System.out.println("Contents of the file: " + fileContents);
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
