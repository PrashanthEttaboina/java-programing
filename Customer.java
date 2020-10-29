class Restaurant
{
void menu()
{
System.out.println("1.Idly 2.Poori 3.wada 4.Dosa 5.Fried rice 6.Curd rice ");
}
void takeOrder(String order)
{
System.out.println("The order given by the customer is : "+order);
}
String serveFood(String food)
{
return food;
}
int giveBill(int bill)
{
System.out.println("The Amount to be paid is : "+bill);
return bill;
}
String billPaid()
{
return "Amount Paid - Please visit again"; 
}
}

class Customer
{
public static void main(String args[])
{
Restaurant ratna = new Restaurant();
ratna.menu();
ratna.takeOrder("Curd rice");
System.out.println("The food served is : "+ratna.serveFood("Curd rice"));
System.out.println("Paid : "+ratna.giveBill(120));
System.out.println(ratna.billPaid());

}
}