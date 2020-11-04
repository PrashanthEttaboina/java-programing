import java.util.Scanner;

public class FactSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value for n : ");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum+=fact(rem);
			n/=10;	
		}
System.out.print("The sum of the individual digits for the given value is : "+sum);
	
	}
static int fact(int n)
{
	int f=1;
	for(;n>0;)
	{
		f=f*n;
		n--;
	}
	
	return f;
}
}
