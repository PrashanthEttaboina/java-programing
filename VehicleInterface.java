interface Vehicle 
{
void cost();
void mileage();
void topspeed();
void capacity();
void gears();
void fuel();
}

abstract class Car implements Vehicle
{
abstract void viper();
abstract void tyre();
abstract void steering();
abstract void door();
Car(String name)
{
System.out.println("The name of the car is "+name);
}
}


abstract class Bike implements Vehicle
{
abstract void handle();
abstract void tyre();
abstract void stand();
Bike(String name)
{
System.out.println("The name of the bike is "+name);
}
}

class Apache extends Bike
{
Apache()
{
super("Apache");
}
public void cost()
{
System.out.println("Cost of an Apache is 2 lakhs");
}
public void mileage()
{
System.out.println("Mileage given is 48km");
}
public void topspeed()
{
System.out.println("top speed is 320km/hr ");
}
public void capacity()
{
System.out.println("Seating capacity is 2");
}
public void gears()
{
System.out.println("number of gears are 6");
}
public void fuel()
{
System.out.println("Fuel used is Petrol");
}
void handle()
{
System.out.println("It have a handle ");
}
void tyre()
{
System.out.println("it have 2 tyres ");
}
void stand()
{
System.out.println("It have a stand to park ");
}
}


class Pulsar extends Bike
{
Pulsar()
{
super("Pulsar");
}
public void cost()
{
System.out.println("Cost of an Pulsar is 1.5 lakhs");
}
public void mileage()
{
System.out.println("Mileage given is 68km");
}
public void topspeed()
{
System.out.println("top speed is 180km/hr ");
}
public void capacity()
{
System.out.println("Seating capacity is 2");
}
public void gears()
{
System.out.println("number of gears are 6");
}
public void fuel()
{
System.out.println("Fuel used is Petrol");
}
void handle()
{
System.out.println("It have a handle ");
}
void tyre()
{
System.out.println("it have 2 tyres ");
}
void stand()
{
System.out.println("It have a stand to park ");
}
}




class Audi extends Car
{
Audi()
{
super("Q6");
}
public void cost()
{
System.out.println("Cost of an audi car is 30 lakhs");
}
public void mileage()
{
System.out.println("Mileage given is 8km");
}
public void topspeed()
{
System.out.println("top speed is 280km/hr ");
}
public void capacity()
{
System.out.println("Seating capacity is 4");
}
public void gears()
{
System.out.println("number of gears are 6");
}
public void fuel()
{
System.out.println("Fuel used is Diesel");
}
void viper()
{
System.out.println("A car consists of 2 vipers " );
}
void tyre()
{
System.out.println("A car consists of 4 tyres  ");
}
void steering()
{
System.out.println("A car consists of steering ");
}
void door()
{
System.out.println("A car consists of 4 doors ");
}

}


class BMW extends Car
{
BMW()
{
super("X1");
}
public void cost()
{
System.out.println("Cost of an audi car is 20 lakhs");
}
public void mileage()
{
System.out.println("Mileage given is 12km");
}
public void topspeed()
{
System.out.println("top speed is 200km/hr ");
}
public void capacity()
{
System.out.println("Seating capacity is 4");
}
public void gears()
{
System.out.println("number of gears are 6");
}
public void fuel()
{
System.out.println("Fuel used is Diesel");
}
void viper()
{
System.out.println("A car consists of 2 vipers " );
}
void tyre()
{
System.out.println("A car consists of 4 tyres  ");
}
void steering()
{
System.out.println("A car consists of steering ");
}
void door()
{
System.out.println("A car consists of 4 doors ");
}

}


class VehicleInterface
{
public static void main(String [] args)
{
System.out.println("=======================Car 1 Details======================");
Audi car=new Audi();
car.cost();
car.mileage();
car.topspeed();
car.capacity();
car.gears();
car.fuel();
car.viper();
car.tyre();
car.steering();
car.door();
System.out.println("=======================Car 2 Details======================");
BMW car1=new BMW();
car1.cost();
car1.mileage();
car1.topspeed();
car1.capacity();
car1.gears();
car1.fuel();
car1.viper();
car1.tyre();
car1.steering();
car1.door();

System.out.println("======================Bike 1 Details======================");
Apache bike=new Apache();
bike.cost();
bike.mileage();
bike.topspeed();
bike.capacity();
bike.gears();
bike.fuel();
bike.stand();
bike.handle();
bike.tyre();


System.out.println("======================Bike 2 Details======================");
Pulsar bike1=new Pulsar();
bike1.cost();
bike1.mileage();
bike1.topspeed();
bike1.capacity();
bike1.gears();
bike1.fuel();
bike1.stand();
bike1.handle();
bike1.tyre();

}

}