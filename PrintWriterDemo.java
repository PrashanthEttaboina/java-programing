package com.files;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("D:/earth.txt");
		String s="Earth is the only planet in the universe suitable for living ";
		pw.write(s);
		pw.close();
		FileReader fr=new FileReader("D://earth.txt");
		int i=fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();
	}

}
