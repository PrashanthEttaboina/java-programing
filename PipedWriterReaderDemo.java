package com.files;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedWriterReaderDemo {

	public static void main(String[] args) throws IOException {
		
		PipedWriter pw=new PipedWriter();
		PipedReader pr=new PipedReader();
		String s="Sun is in the middle of the Solar System. ";
		pw.connect(pr);
		pw.write(s);
		pw.append(" Earth is the third planet in the solar system");
		int i=pr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=pr.read();
		}
		pw.close();
		pr.close();
	}

}
