package com.simplilearn.fsd.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("data.txt");
		fw.write("Hello everyone!!!");
		fw.close();
	}
}
