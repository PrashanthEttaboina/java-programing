public class Car
{
void start()
{
System.out.println("All cars start using keys ");
}
void engine()
{
System.out.println("Every car have its own engine ");
}
}




class BMW extends Car  //Hierarchial inheritance is used 
{
void mileage()
{
System.out.println("BMW car gives 12km of Mileage");
}
void cost()
{
System.out.println("BMW costs around 30 lakhs ");
}
void speed()
{
System.out.println("top speed of a BMW car is 240 km/hr ");
}
public static void main(String args[])
{
BMW car1= new BMW();
car1.start();
car1.engine();
car1.mileage();
car1.speed();
car1.cost();
}
}




class Audi extends Car  //Hierarchial inheritance is used 
{
void mileage()
{
System.out.println("Audi car gives 8km of Mileage");
}
void cost()
{
System.out.println("Audi costs around 50 lakhs ");
}
void speed()
{
System.out.println("top speed of a Audi car is 300 km/hr ");
}
public static void main(String args[])
{
Audi car2= new Audi();
car2.start();
car2.engine();
car2.mileage();
car2.speed();
car2.cost();
}
}

