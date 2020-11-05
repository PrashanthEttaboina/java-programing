import java.util.Scanner;
public class codePointString
{
public static void main(String [] args)
{
 	Scanner obj=new Scanner (System.in);
	 String a=obj.nextLine();
	 System.out.println("Ascii values of the given string are :");
	 for(int i=0;i<a.length();i++)
	 {
		 System.out.println(a.codePointAt(i));
	 }
 }
}
