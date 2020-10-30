
class Mobile 
{
void sim()
{
System.out.println("Every mobile have sim ");
}
void display()
{
System.out.println("Every Mobile have touch type of display");
}
}

 class Oneplus extends Mobile    //Hierarchial inheritance 
{
void ram()
{
System.out.println("This mobile have 6GB of ram ");
}
void processor()
{
System.out.println("This mobile have snapdragon processor ");
}
void battery()
{
System.out.println("The battery  capacity is 5000mah");
}
public static void main(String args[])
{
Oneplus phone=new Oneplus();
phone.ram();
phone.processor();
phone.display();
phone.sim();
phone.battery();
}
}

 class Iphone extends Mobile   //Hierarchial inheritance 
{
void ram()
{
System.out.println("This mobile have 8GB of ram ");
}
void processor()
{
System.out.println("This mobile have ios processor ");
}
void battery()
{
System.out.println("The battery  capacity is 3500mah");
}
public static void main(String args[])
{
Iphone phone=new Iphone();
phone.ram();
phone.processor();
phone.display();
phone.sim();
phone.battery();
}
}