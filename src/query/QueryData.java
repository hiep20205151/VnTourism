package query;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.jena.query.ParameterizedSparqlString;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.rdf.model.Model;

import time.MyTime;
import topic.VnTourismTopic;

public class QueryData implements Query {
	private int numData;
	private ArrayList<VnTourismTopic> topics = new ArrayList<VnTourismTopic>();
	
	public int getNumData() {
		return numData;
	}

	public void setNumData(int numData) {
		this.numData = numData;
	}

	public void printTopic() {
		for (VnTourismTopic topic : topics)
			System.out.println(topic.getTopic());
	}

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

	public static String insert(String filePath, String topic) {
		Scanner sc;
		try {
			sc = new Scanner(new File(filePath));
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

	public static String copyFile(File source, File dest) {
		try {
			Files.copy(source.toPath(), dest.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dest.toString();
	}

	public void add(VnTourismTopic topic) {
		topics.add(topic);
	}

	public void processQuery() {
		for (VnTourismTopic topic : topics) {
			ParameterizedSparqlString qs = new ParameterizedSparqlString(topic.getInput());
			QueryExecution exec = QueryExecution.service("http://dbpedia.org/sparql", qs.asQuery());
			Model m = exec.execConstruct();
			OutputStream outStream;
			try {
				outStream = new FileOutputStream(topic.getOutput(), false);
				m.write(outStream, "Turtle");
				System.out.println("Output file created: " + topic.getOutput());
			} catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
		}
		System.out.println("Done!");
	}

	public void printTime() {
		MyTime timeQuery = new MyTime();
		timeQuery.print();
	}

	public void printNumData() {
		int totalData = 0;
		for (VnTourismTopic topic : topics) {
			this.setNumData(readInput(topic.getOutput()).split("\n\n").length - 1);
			System.out.println("Number of datas in " + topic.getTopic() + ": " + this.getNumData());
			totalData += this.getNumData();
		}
		System.out.println("Total number of datas: " + totalData);
	}
}
