import java.util.Scanner;
class Pat20
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");	
		int n=sc.nextInt();
		int p=1;
		for(int i=1;i<=n;i++)
		{
			       
  			for(int j=i;j<n;j++)
				System.out.print("  ");
			for(int k=1;k<=i;k++)
			{
				if(p<10)
				System.out.print("0"+p++);
				else
				System.out.print(p++);
			}
			System.out.println();
		}
			
	}
}
