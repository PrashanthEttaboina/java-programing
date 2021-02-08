package AbstractFactoryPattern;

public class Dog implements Animal {

	@Override
	public void Characteristics() {
		System.out.println("======Dog=======");
		System.out.println("This is a Domestic animal");
		System.out.println("It have a strong sense of smell");		
	}
}
