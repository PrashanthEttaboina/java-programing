package singletonPattern;

public class MainObject {

	private static MainObject mo=new MainObject();
	
	private MainObject()
	{
					//making constructor as private 
	}
	
	public static MainObject getObject()
	{
		return mo;
		
	}
	
	
	
	public void message()
	{
		System.out.println("Hi this is prashanth");
	}
}
