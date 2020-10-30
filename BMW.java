class Vehicle 
{
void use()
{
System.out.println("vehicle is used to travel ");
}
}
class Car extends Vehicle
{
void tyre()
{
System.out.println("Every car have 4 tyres ");
}
void start()
{
System.out.println("Every car starts with a key");
}
void fuel()
{
System.out.println("Every car uses fuel to drive ");
}

}
public class BMW extends Car // Multilevel Inheritance is used here 
{
void cost()
{
System.out.println("BMW car cost is 30Lakhs on average");
}
void mileage()
{
System.out.println("This BMW car gives a mileage of 10KM ");
}
public static void main(String args[])
{
BMW model=new BMW();
model.use();
model.tyre();
model.start();
model.fuel();
model.cost();
model.mileage();
}
}