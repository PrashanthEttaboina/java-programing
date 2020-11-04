import java.util.Scanner;

public class FactDoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print the factorial : ");
		int n=sc.nextInt();
		int fact=1;
		do
		{
			fact=fact*n;
			n--;
		}while(n>0);
		System.out.println("The factorial of given number is = "+fact);

	}

}
