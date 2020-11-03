class Vehicle
{
	void use()
	{
		System.out.println("It is used for transportation");
	}
	class Car
	{
		void speed()
		{
			System.out.println("Top speed of an Audi is 300 km/hr");
		}
		void mileage()
		{
			System.out.println("Average mileage given by an audi is 12km/litre");
		}
	}
	class Bike
	{
		void speed()
		{
			System.out.println("Top speed of an bike is 150 km/hr");
		}
		void mileage()
		{
			System.out.println("Average mileage given by an bike is 62km/litre");
		}
		
	}
}
public class MemberInnerClass2 {

	public static void main(String[] args) {
		
		Vehicle v=new Vehicle();
		Vehicle.Car audi=new Vehicle().new Car();
		v.use();
		audi.speed();
		audi.mileage();
		
		Vehicle.Bike apache =new Vehicle().new Bike();
		v.use();
		apache.speed();
		apache.mileage();
	}

}
