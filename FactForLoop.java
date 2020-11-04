import java.util.Scanner;

public class FactForLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print the factorial : ");
		int n=sc.nextInt();
		int fact=1;
		for(;n>0;)
		{
			fact=fact*n;
			n--;
		}
		System.out.println("The factorial of given number is = "+fact);
	}

}
