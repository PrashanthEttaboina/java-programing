import java.util.Scanner;

class JNIT
{
static
	{
		System.out.println("This is static from JNIT");
	}
JNIT()
{
	System.out.println("This is official JNIT");
}
}

class Motivity
{
static
	{
		System.out.println("This is static from Motivity");
	}
Motivity()
{
	System.out.println("This is official Motivity");
}
}
public class StaticTest {

	
	public static void main(String[] args) throws Exception{
		
		System.out.println("This is main method");
		System.out.println("Enter the class name to be loaded : ");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		Class c=Class.forName(name);
		System.out.println(c.getName());
		c.newInstance();
	}

}
