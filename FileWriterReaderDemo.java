package com.files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("D://world.txt");
		String s="Earth is my world";
		fw.write(s);
		fw.close();
		FileReader fr = new FileReader("D://world.txt");
		int i =fr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();
	}

}
