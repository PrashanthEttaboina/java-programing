import java.util.Scanner;

public class Replace {

	public static void main(String [] args)
	{
	 Scanner sc=new Scanner (System.in);
			System.out.println("enter a string");
			String a=sc.nextLine();
			
			System.out.println(a.replace(' ',','));
					
	 }
}
