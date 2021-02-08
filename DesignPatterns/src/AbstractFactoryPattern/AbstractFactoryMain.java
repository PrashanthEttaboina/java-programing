package AbstractFactoryPattern;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		
	AnimalType at=FactoryProducer.getFactory("Wild");
	Animal a=at.getType("Lion");
	a.Characteristics();
	
	a=at.getType("Tiger");
	a.Characteristics();
	
	
	 at=FactoryProducer.getFactory("Domestic");
	 a=at.getType("Dog");
	a.Characteristics();
	
	a=at.getType("cat");
	a.Characteristics();
	}

}
