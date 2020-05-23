package com.simplilearn.fsd.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {
	public static void main(String args[]) throws IOException{
		FileOutputStream fos =  new FileOutputStream("data.txt");
		fos.write(65);
		fos.close();
	
		FileInputStream fis = new FileInputStream("data.txt");
		int i = 0;
		while((i=fis.read())!=-1)
			System.out.println((char)i);
		fis.close();
	}		
}
