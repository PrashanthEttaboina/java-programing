package AbstractFactoryPattern;

public class Domestic extends AnimalType {

	@Override
	Animal getType(String type) {
		 if(type.equalsIgnoreCase("Dog")){
	         return new Dog();         
	      }else if(type.equalsIgnoreCase("Cat")){
	         return new Cat();
	      }else
		return null;	
		
	}

}
