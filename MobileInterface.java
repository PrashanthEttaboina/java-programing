interface Electronics 
{
void weight();
void displayType();
void speakers();
}

abstract class Mobile implements Electronics
{
abstract void cost();
abstract void battery();
abstract void display();
abstract void processor();
Mobile(String name)
{
System.out.println("The name of the mobile is "+name);
}
}
abstract class Laptop implements Electronics
{
abstract void cost();
abstract void battery();
abstract void display();
abstract void processor();
Laptop(String name)
{
System.out.println("The name of the Laptop is "+name);
}
}
class Dell extends Laptop
{
Dell()
{
super("Dell");
}
public void weight()
{
System.out.println("Weight of this mobile is 4.80 kg"); 
}
public void displayType()
{
System.out.println("Display is normal");
}
public void speakers()
{
System.out.println("it have 2 main speakers");
}
void cost()
{
System.out.println("Cost of this Laptop is 35000 ");
}
void battery()
{
System.out.println("Battery capacity of this phone is 8000mah");
}

void display()
{
System.out.println("It has a 15.6 inch display ");
}
void processor()
{
System.out.println("Processor of Dell is AMD");
}
}

class MSI extends Laptop
{
MSI()
{
super("MSI");
}
public void weight()
{
System.out.println("Weight of this mobile is 3.60 kg"); 
}
public void displayType()
{
System.out.println("Display is full HD");
}
public void speakers()
{
System.out.println("it have 2 main speakers");
}
void cost()
{
System.out.println("Cost of this Laptop is 87000 ");
}
void battery()
{
System.out.println("Battery capacity of this phone is 11000mah");
}

void display()
{
System.out.println("It has a 16.2 inch display ");
}
void processor()
{
System.out.println("Processor of ASUS is Intel i11");
}
}

class Iphone extends Mobile
{
Iphone()
{
super("Iphone");
}
public void weight()
{
System.out.println("Weight of this mobile is 280 grams"); 
}
public void displayType()
{
System.out.println("Display is full touch");
}
public void speakers()
{
System.out.println("it only have one main speaker");
}
void cost()
{
System.out.println("Cost of this phone is 50000 ");
}
void battery()
{
System.out.println("Battery capacity of this phone is 3500mah");
}

void display()
{
System.out.println("It has a 6 inch display with onscreen fingerprint sensor");
}
void processor()
{
System.out.println("Processor of iphone is TSMC");
}

}


class Oneplus extends Mobile
{
Oneplus()
{
super("Oneplus");
}
public void weight()
{
System.out.println("Weight of this mobile is 220 grams"); 
}
public void displayType()
{
System.out.println("Display is full touch");
}
public void speakers()
{
System.out.println("it only have one main speaker and one on ear speaker");
}
void cost()
{
System.out.println("Cost of this phone is 45000 ");
}
void battery()
{
System.out.println("Battery capacity of this phone is 5000mah");
}
void processor()
{
System.out.println("Processor of Oneplus is Snapdragon 865+ ");
}
void display()
{
System.out.println("It has a 6.4 inch display with full touch and onscreen fingerprint sensor");
}
}


class MobileInterface
{
public static void main(String args[])
{

System.out.println("===============Mobile 1 Details================");
Mobile phone=new Iphone();
phone.weight();
phone.displayType();
phone.speakers();
phone.cost();
phone.battery();
phone.processor();
phone.display();

System.out.println("===============Mobile 2 Details================");
 phone=new Oneplus();
phone.weight();
phone.displayType();
phone.speakers();
phone.cost();
phone.battery();
phone.processor();
phone.display();

System.out.println("===============Laptop 1 Details================");
Laptop lap1 =new Dell();
lap1.weight();
lap1.displayType();
lap1.speakers();
lap1.cost();
lap1.battery();
lap1.processor();
lap1.display();


System.out.println("===============Laptop 2 Details================");
 lap1 =new MSI();
lap1.weight();
lap1.displayType();
lap1.speakers();
lap1.cost();
lap1.battery();
lap1.processor();
lap1.display();
}
}
