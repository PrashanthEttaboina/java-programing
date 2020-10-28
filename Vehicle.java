class Car
{
String car_name;
String car_type;
String car_engine_type;
int car_seater;
String car_engine_version;
int car_airbags;
String car_fuel;
String car_steering;
float car_mileage;
int car_top_speed;
int car_gears;
static String company;
}
public class Vehicle
{
public static void main(String [] args)
{
Car c1= new Car();
c1.car_name="i20 Asta";
c1.car_type="Hatchback";
c1.car_engine_type="U2 CRDi Diesel Engine";
c1.car_seater=5;
c1.car_engine_version="1.4 litre 88.73 bhp 16V ";
c1.car_airbags=2;
c1.car_fuel="Diesel";
c1.car_steering="Normal";
c1.car_mileage=22.54f;
c1.car_top_speed=180;
c1.car_gears=6;
Car.company="Hyundai";

System.out.println("==============Car Details=================");
System.out.println("Car Name = "+c1.car_name);
System.out.println("Model = "+c1.car_type);
System.out.println("Engine Type = "+c1.car_engine_type);
System.out.println("Engine Version = "+c1.car_engine_version);
System.out.println("Seating Capacity = "+c1.car_seater);
System.out.println("Number of Airbags = "+c1.car_airbags);
System.out.println("Fuel Type = "+c1.car_fuel);
System.out.println("Steering Type = "+c1.car_steering);
System.out.println("Mileage = "+c1.car_mileage);
System.out.println("Top Speed in KM = "+c1.car_top_speed);
System.out.println("Number of Gears = "+c1.car_gears);
System.out.println("Company Name = "+Car.company);
}
}
