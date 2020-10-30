class Square
{
int a=10;
void sqr()
{
int b=a*a;
System.out.println("the square is  :"+b);
}
}
public class Sum extends Square   // Single inheritamce
{
int b=20;
void sum()
{
System.out.println("The sum is : "+(a+b));
}
public static void main(String args[])
{
Sum s= new Sum();
s.sqr();
s.sum();
}
}
