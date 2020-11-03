import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {

		HashMap<Integer, String> student =new HashMap<Integer,String>();
		student.put(1,"Vinay");
		student.put(2, "Prashanth");
		student.put(4,"arafath");
		student.put(3, "Vinay");
		student.put(5, "Prasanna");
		student.put(6, "Goutham");
		student.put(9,"Pranav");
		student.put(7,"Revanth");
		student.put(8,"Vaishnavi");
		student.put(4,"Shankar");  //on key value 4 arafath will be updated to shankar
		student.remove(3); //Entry having key value 3 will be deleted 
		Set s=student.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry m=(Map.Entry)i.next();
			System.out.println("Key value = "+m.getKey()+"  Student Name = "+m.getValue());
		}
		System.out.println("\n\n Using for each normally");
		for(Map.Entry m: student.entrySet())  //here we used both for each and entry set
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("\n\n\n Using for each using Set \n");
		Set<Map.Entry<Integer,String>> s1=student.entrySet();
		for(Map.Entry<Integer,String> x : s1)
		{
			System.out.println(x.getKey()+" "+x.getValue());
		}
	}
}
