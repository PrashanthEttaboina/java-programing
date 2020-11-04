import java.util.Scanner;

public class SimpleSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value for n : ");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
System.out.print("The sum of the individual digits for the given value is : "+sum);
	}

}
