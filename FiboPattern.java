import java.util.Scanner;

public class FiboPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value for row and column :");
		int r=sc.nextInt();
		int a=-1,b=1,sum=0;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				sum=a+b;
				a=b;
				b=sum;
				System.out.print(sum+" ");
			}
			System.out.println();
		}
		
	}

}
