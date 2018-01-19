package com.aicalculator.datatransfer.file;

import java.io.IOException;

public class FileOperator {
	
	public void writeToFile(String path, boolean append_to_file, String textLine) throws IOException { 
		WriteFile write_file = new WriteFile(path,append_to_file);
		write_file.writeToFile(textLine);
		
	}
	
	public String readFile(String path) throws IOException { 
		ReadFile read_file = new ReadFile(path);
		int numberOfLines = read_file.readLines();
		String[] textLine = read_file.openFile(numberOfLines);
		return textLine[0];
		
	}

}
