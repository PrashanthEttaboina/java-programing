import java.util.Scanner;

public class ToCharArray {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		char k[]=a.toCharArray();
		
		for(int i=0;i<k.length;i++)
		System.out.println(k[i]);
	}
}
