package com.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterReaderDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("D://vasanth.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("This is vasanth ");
		bw.append("brother of prashanth");
		bw.close();
		
		FileReader fr=new FileReader("D://vasanth.txt");
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
		System.out.println(s);
		
	}

}
