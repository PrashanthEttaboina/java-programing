import java.util.Scanner;
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
Car(String car_name,String car_type,String car_engine_type,int car_seater,String car_engine_version,int car_airbags,String car_fuel,String car_steering,float car_mileage,int car_top_speed,int car_gears)
{
this.car_name=car_name;
this.car_type=car_type;
this.car_engine_type=car_engine_type;
this.car_seater=car_seater;
this.car_engine_version=car_engine_version;
this.car_airbags=car_airbags;
this.car_fuel=car_fuel;
this.car_steering=car_steering;
this.car_mileage=car_mileage;
this.car_top_speed=car_top_speed;
this.car_gears=car_gears;
this.company="Hyundai";

this.display();
}
void display()
{
System.out.println("==============Car Details=================");
System.out.println("Car Name = "+car_name);
System.out.println("Model = "+car_type);
System.out.println("Engine Type = "+car_engine_type);
System.out.println("Engine Version = "+car_engine_version);
System.out.println("Seating Capacity = "+car_seater);
System.out.println("Number of Airbags = "+car_airbags);
System.out.println("Fuel Type = "+car_fuel);
System.out.println("Steering Type = "+car_steering);
System.out.println("Mileage = "+car_mileage);
System.out.println("Top Speed in KM = "+car_top_speed);
System.out.println("Number of Gears = "+car_gears);
System.out.println("Company Name = "+Car.company);
}

}



public class VehicleMethod
{
public static void main(String [] args)
{
Car c1= new Car("i20 Asta","Hatchback","U2 CRDi Diesel Engine",5,"1.4 litre 88.73 bhp 16V ",2,"Diesel","Normal",22054f,180,6);
}
}
