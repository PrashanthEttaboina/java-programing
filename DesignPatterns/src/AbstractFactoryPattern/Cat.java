package AbstractFactoryPattern;

public class Cat implements Animal {

	@Override
	public void Characteristics() {
		System.out.println("======Cat=======");
		System.out.println("This is a Domestic animal");
		System.out.println("It is lazy");		
	}
}
