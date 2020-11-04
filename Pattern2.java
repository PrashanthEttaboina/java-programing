import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value for row and column :");
		int r=sc.nextInt();
		int k=1;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(k%2==0)
					System.out.print("0");
				
				else 
					System.out.print("1");
				k++;	
			}
			System.out.println();
		}
	}

}
