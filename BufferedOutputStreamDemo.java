package com.files;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		try {
			FileOutputStream fo=new FileOutputStream("D://java.txt");
			BufferedOutputStream bo=new BufferedOutputStream(fo);
			String s="i am learning java in motivity labs ";
			bo.write(s.getBytes());
			bo.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
