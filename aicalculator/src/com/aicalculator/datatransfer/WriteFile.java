package com.aicalculator.datatransfer;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class WriteFile {
	private String path;
	private boolean append_to_file = false;

	public WriteFile(String filePath) {
		this.path = filePath;
	}

	public WriteFile(String file_path, boolean append_value) {

		this.path = file_path;
		this.append_to_file = append_value;

	}
	
	public void writeToFile(String textLine) throws IOException {
		FileWriter write = new FileWriter( path , append_to_file );
		PrintWriter print_line = new PrintWriter(write);
		print_line.printf( "%s" + "%n" , textLine);
		print_line.close();
		write.close();
	}

}
