package AbstractFactoryPattern;

public class Wild extends AnimalType {

	@Override
	Animal getType(String type) {
		 if(type.equalsIgnoreCase("Lion")){
	         return new Lion();         
	      }else if(type.equalsIgnoreCase("Tiger")){
	         return new Tiger();
	      }else
		return null;	 
	    
		
	}

}
