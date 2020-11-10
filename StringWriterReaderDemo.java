package com.files;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringWriterReaderDemo {

	public static void main(String[] args) throws IOException {
		
		StringWriter sw=new StringWriter();
		String str="earth and mars";
		sw.write(str);
		sw.append(" are neighbours");
		
		StringReader sr=new StringReader(sw.getBuffer().toString());
		
		int i=sr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=sr.read();
		}
		sw.close();
		sr.close();
	}

}
