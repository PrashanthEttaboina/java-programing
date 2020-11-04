import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  value : ");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			sum+=n;
			n--;
		}
		System.out.println("The value of summ is : "+sum);
	}

}
