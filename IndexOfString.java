import java.util.Scanner;

public class IndexOfString {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		 String a=sc.nextLine();
		 System.out.println("Enter a character to find the index : ");
		 char A=sc.next().charAt(0);
		int i=a.indexOf(A);
			for(;i>-1;)
			{
				System.out.println(i);
				i=a.indexOf(A,i+1);
			}
	}
}
