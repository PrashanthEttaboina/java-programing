abstract class Car
{
abstract void cost(); 

abstract void mileage();

abstract void topspeed();

abstract void fuel();
}
class Audi extends Car
{
Audi()
{
System.out.println("This is a Audi Car " );
}
void cost()
{
System.out.println("In this brand the basic car cost is 30lakh ");
}
void mileage()
{
System.out.println("Average Mileage given is 12km ");
}
void fuel()
{
System.out.println("This uses diesel ");
}
void topspeed()
{
System.out.println("top speed is 280km/hr");
}
}



class Ferrari extends Car
{
Ferrari()
{
System.out.println("This is a Ferrari Car " );
}
void cost()
{
System.out.println("In this brand the basic car cost is 3crore ");
}
void mileage()
{
System.out.println("Average Mileage given is 8km ");
}
void fuel()
{
System.out.println("This uses diesel ");
}
void topspeed()
{
System.out.println("top speed is 360km/hr");
}
}


class CarUpcasting
{
public static void main(String [] args)
{
System.out.println("==============Car 1 Details===============");
Car x=new Audi();
x.cost();
x.mileage();
x.fuel();
x.topspeed();
System.out.println("==============Car 2 Details===============");

x=new Ferrari();
x.cost();
x.mileage();
x.fuel();
x.topspeed();
}
}