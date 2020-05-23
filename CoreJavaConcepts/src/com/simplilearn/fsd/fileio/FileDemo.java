package com.simplilearn.fsd.fileio;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String args[]) throws IOException{
		File file = new File("demo.txt");
		
		if(file.createNewFile())
			System.out.println("File created now");
		
		else {
			System.out.println("File exists");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.length());
		}
	}
}
