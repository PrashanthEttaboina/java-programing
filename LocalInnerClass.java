class Vehicles
{
	void use()
	{
		int bikeMileage=60;
		int carMileage=15;
		System.out.println("Vehicles are used for transportation");
	
	class Car
	{
		void speed(String name,int fast)
		{
			System.out.println("top speed of  a "+name+" car is "+fast);
		}
		void mileage()
		{
			System.out.println("Mileage of given by the car is "+carMileage);
		}
	}
	class Bike
	{
		void speed(String name,int fast)
		{
			System.out.println("top speed of  a "+name+" car is "+fast);
		}
		void mileage()
		{
			System.out.println("Mileage of given is : "+bikeMileage);
		}
	}
	Car audi=new Car();
	audi.speed("Audi",220);
	audi.mileage();
	
	Bike apache=new Bike();
	apache.speed("Apache",180);
	apache.mileage();		
	}
}
public class LocalInnerClass {

	public static void main(String[] args) {
		Vehicles v=new Vehicles();
		v.use();
		
	}

}
