package FactoryPattern;

public class TravelFactory {

	public static Journey startJourney(String destination)
	{
		  if (destination == null || destination.isEmpty())
	            return null;
	        if (destination.equals("Hyderabad")) {
	            return new Hyderabad();
	        }
	        if (destination.equals("Chennai")) {
	            return new Chennai();
	        }
	        return null;
	}
}
