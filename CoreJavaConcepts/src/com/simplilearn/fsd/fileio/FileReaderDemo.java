package com.simplilearn.fsd.fileio;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("data.txt");
		Scanner s =  new Scanner(fr);
		while(s.hasNextLine()) {
			System.out.println(s.nextLine());
		}

	}

}
