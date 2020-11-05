
public class NumberFormatExceptionDemo {

	public static void main(String[] args) {
		String s=null;
		try
		{
			int a=Integer.parseInt(s);
			System.out.println(a);
		}
		catch(NumberFormatException nf)
		{
			nf.printStackTrace();
			
		}
		System.out.print(s);
	}

}
