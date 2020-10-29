import java.util.Scanner;
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

class CustomerScanner
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
Restaurant ratna = new Restaurant();
ratna.menu();
System.out.println("Enter the Order");
ratna.takeOrder(sc.next());
System.out.println(ratna.serveFood());
System.out.println("Pay the Bill ");
System.out.println("Paid : "+ratna.giveBill(sc.nextInt()));
System.out.println(ratna.billPaid());


}
}