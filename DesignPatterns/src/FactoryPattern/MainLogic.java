package FactoryPattern;

public class MainLogic {

	public static void main(String[] args) {
		TravelFactory tf = new TravelFactory();
        Journey t = TravelFactory.startJourney("Hyderabad");
        t.Travel();
	}

}
