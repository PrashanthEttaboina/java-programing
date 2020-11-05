
public class NullPointerDemo {

	public static void main(String[] args) {
		String s=null;
		try
		{
			int k=s.length();
			System.out.println(s);
		}
		catch(NullPointerException np)
		{
			np.printStackTrace();
		}
	}

}
