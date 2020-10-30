class Vehicle 
{
void engine()
{
System.out.println("This car have the highest model of engine ");
}
void tyre()
{
System.out.println("This car has 5 tyres ");
}
void Fuel()
{
System.out.println("This car runs of Diesel ");
}
}
public class Car extends Vehicle    //Single inheritance
{
public static void main(String args[])
{
Car Benz=new Car();
Benz.engine();
Benz.tyre();
Benz.Fuel();
}
}