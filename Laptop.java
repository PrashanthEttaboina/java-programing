class Electronics 
{
void display()
{
System.out.println("this gadget have display ");
}
void buttons()
{
System.out.println("this gadget have buttons to take input");
}
void battery()
{
System.out.println("This gadget runs on battery ");
}
}
public class Laptop extends Electronics  //Single Inheritance
{
public static void main(String args[])
{
Laptop dell=new Laptop();
dell.display();
dell.buttons();
dell.battery();
}
}