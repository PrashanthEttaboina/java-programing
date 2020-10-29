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
void takeOrder(String order1,String order2)
{
System.out.println("The order given by the customer is : "+order1+" and "+order2);
}
void takeOrder(String order1,String order2,String order3)
{
System.out.println("The order given by the customer is : "+order1+", "+order2+" and "+order3);
}
String serveFood()
{
return "food is served ";
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

class CustomerMethod
{
public static void main(String args[])
{

System.out.println("=============Order 1================");
Restaurant ratna = new Restaurant();
ratna.menu();
ratna.takeOrder("Curd rice");
System.out.println(ratna.serveFood());
System.out.println("Paid : "+ratna.giveBill(120));
System.out.println(ratna.billPaid());

System.out.println("=============Order 2================");
Restaurant ashoka = new Restaurant();
ashoka.menu();
ashoka.takeOrder("Curd rice","poori","Dosa");
System.out.println(ashoka.serveFood());
System.out.println("Paid : "+ashoka.giveBill(620));
System.out.println(ashoka.billPaid());
}
}