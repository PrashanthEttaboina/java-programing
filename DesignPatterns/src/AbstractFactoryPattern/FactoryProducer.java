package AbstractFactoryPattern;

public class FactoryProducer
{
	public static AnimalType getFactory(String type)
	{
		if (type.equalsIgnoreCase("Domestic"))
		{
			return new Domestic();
		} 
		else if (type.equalsIgnoreCase("Wild"))
		{
			return new Wild();
		} 
		else
			return null;

	}
}
