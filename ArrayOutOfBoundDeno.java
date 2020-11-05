
public class ArrayOutOfBoundDeno {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		try
		{
			System.out.println(a[12]);
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			ai.printStackTrace();
		}
	}

}
