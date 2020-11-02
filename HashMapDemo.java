import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> student =new HashMap<Integer,String>();
		student.put(1,"Vinay");
		student.put(2, "Prashanth");
		student.put(4,"arafath");
		student.put(3, "Vinay");
		student.put(4,"Shankar");  //on key value 4 arafath will be updated to shankar
		student.remove(3); //Entry having key value 3 will be deleted 
		for(Map.Entry m: student.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(student);
	}

}
