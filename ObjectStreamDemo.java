package com.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileOutputStream fo=new FileOutputStream("D://prashanth.txt");
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		String name="Vasanth is brother of prashanth";
		oo.writeObject(name);
		
		FileInputStream fi=new FileInputStream("D://prashanth.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
		name=(String)oi.readObject();
		System.out.println(name);
		
		oo.close();
		oi.close();
	}

}
