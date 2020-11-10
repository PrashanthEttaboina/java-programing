package com.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi=new FileInputStream("D://prashanth.txt");
		FileOutputStream fo1=new FileOutputStream("D://java.txt");
		String sub="I'am attending java training for Motivity labs.";
		fo1.write(sub.getBytes());
		FileInputStream fi1=new FileInputStream("D://java.txt");
		
		
		SequenceInputStream si=new SequenceInputStream(fi,fi1);
		
		int i=si.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=si.read();
		}
		fi.close();
		fo1.close();
		fi1.close();
		si.close();
		
	}

}
