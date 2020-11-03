import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(21);
		v.add(52);
		v.add(69);
		v.add(45);
		v.add(30);
		v.add(19);
		v.add(34);
		v.add(27);
		v.add(69);
		
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements())    //vector follows insertion order only
		{
			System.out.println(e.nextElement());
		}
		System.out.println("\n\nusing for each loop for printing ");
		for(int x : v)
		{
			System.out.println(x);
		}
		
	}

}
