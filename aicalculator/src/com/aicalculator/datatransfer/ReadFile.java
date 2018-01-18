package com.aicalculator.datatransfer;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {
	private String path;

	public ReadFile(String filepath) {
		this.path = filepath;
	}

	private BufferedReader initializeFileReaders() throws IOException {
		FileReader fr = new FileReader(this.path);
		BufferedReader textReader = new BufferedReader(fr);
		return textReader;
	}

	public int readLines() throws IOException {
		BufferedReader textReader = this.initializeFileReaders();
		int numberOfLines = 0;

		while (textReader.readLine() != null) {
			numberOfLines++;
		}

		textReader.close();

		return numberOfLines;
	}

	public String[] openFile(int numberOfLines) throws IOException {
		BufferedReader textReader = this.initializeFileReaders();
		String[] textData = new String[numberOfLines];

		for (int i = 0; i < numberOfLines; i++) {
			textData[i] = textReader.readLine();

		}
		textReader.close();
		return textData;
	}
}
