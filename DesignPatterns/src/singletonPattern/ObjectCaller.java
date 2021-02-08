package singletonPattern;

public class ObjectCaller {

	public static void main(String[] args) {
		
		MainObject mo=MainObject.getObject();
		
		mo.message();

	}

}
