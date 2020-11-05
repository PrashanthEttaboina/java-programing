
public class MultipleCatchDemo {

	public static void main(String[] args) {
		String s=null;
		try 
		{
			int k=s.length();
			System.out.println(k);
		}
		catch(NullPointerException np)
		{
			np.printStackTrace();			
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
	}

}
