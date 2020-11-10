package com.files;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
	
		try {
			FileOutputStream fo=new FileOutputStream("D://prashanth.txt");
			String name = "My name is Prashanth ";
			fo.write(name.getBytes());
			fo.close();			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
