package com.files;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fo=new FileOutputStream("D://prashanth.txt");
		String name = "My name is Prashanth ";
		fo.write(name.getBytes());
		fo.close();	
		
		FileInputStream fi=new FileInputStream("D://prashanth.txt");
		BufferedInputStream bs=new BufferedInputStream(fi);
		
		int i=bs.read();
		while(i!=-1){
			System.out.print((char)i);
			i=bs.read();
		}
		fi.close();
		bs.close();
	}

}
