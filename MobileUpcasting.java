abstract class Mobile
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


class Iphone extends Mobile
{
Iphone()
{
super("Iphone");
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
System.out.println("It has a 6 inch display with full touch and onscreen fingerprint sensor");
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


class MobileUpcasting
{
public static void main(String args[])
{

System.out.println("===============Mobile 1 Details================");
Mobile phone=new Iphone();
phone.cost();
phone.battery();
phone.processor();
phone.display();

System.out.println("===============Mobile 2 Details================");
phone=new Oneplus();
phone.cost();
phone.battery();
phone.processor();
phone.display();
}
}
