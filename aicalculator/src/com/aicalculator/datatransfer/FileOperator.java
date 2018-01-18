package com.aicalculator.datatransfer;

import java.io.IOException;

public class FileOperator {
	
	public void writeToFile(String path, boolean append_to_file, String textLine) throws IOException { 
		WriteFile write_file = new WriteFile(path,append_to_file);
		write_file.writeToFile(textLine);
		
	}

}
