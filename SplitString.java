import java.util.Scanner;

public class SplitString {
	public static void main(String [] args)
	{
	 Scanner sc=new Scanner (System.in);
			System.out.println("enter a string");
			String a=sc.nextLine();
			String b[]=a.split(" ");
			for(int i=0;i<b.length;i++)
				System.out.println(b[i]);
						
	 }
}
