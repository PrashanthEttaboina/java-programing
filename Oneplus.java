class Electronics 
{
void battery()
{
System.out.println("it runs on battery ");
}
}
class Mobile extends Electronics 
{
void sim()
{
System.out.println("Every mobile have sim ");
}
void display()
{
System.out.println(" Every Mobile have touch type of display");
}
}
public class Oneplus extends Mobile  // Multilevel Inheritance is used here 
{
void ram()
{
System.out.println("This mobile have 6GB of ram ");
}
void processor()
{
System.out.println("This mobile have snapdragon processor ");
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