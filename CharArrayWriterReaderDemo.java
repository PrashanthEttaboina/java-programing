package com.files;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterReaderDemo {

	public static void main(String[] args) throws IOException {
		
		
		 CharArrayWriter aw=new CharArrayWriter();    
         aw.write("Prashanth and vasanth are brothers ");    
         FileWriter f1=new FileWriter("D:\\prashanth1.txt");    
         FileWriter f2=new FileWriter("D:\\vasanth1.txt");    
         aw.writeTo(f1);    
         aw.writeTo(f2);    
         
         
         String s="Hello world";
         CharArrayReader ar=new CharArrayReader(s.toCharArray());
         int i=ar.read();
         
         while(i!=-1) {
			 System.out.print((char)i);
			 i=ar.read();
		 }
         
         
	}

}
