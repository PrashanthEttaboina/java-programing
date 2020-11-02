
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> employee=new LinkedHashMap<Integer,String>();
		employee.put(1001, "Prsahanth");
		employee.put(1009, "Kumar");
		employee.put(1011, "Goutham");
		employee.put(101, "Ganesh");
		employee.put(1008, "vasanth");
		employee.put(1091, "Rithwick");
		employee.put(1021, "Sai Krishna");
		employee.put(1201, "Pranav");
		employee.put(1051, "Anirudh");
		employee.put(1601, "Revanth");
		employee.put(1002, "Swethak");
		 for(Entry<Integer, String> m:employee.entrySet())   //This follow insertion order
		 {    
		       System.out.println(m.getKey()+" "+m.getValue());    
		     }   
		employee.remove(1009);
		employee.put(1002,"Shashank"); //Swethak will be updated to shashank
		
		System.out.println("\n\nElements after updating some keys and values\n");
		 for(Entry<Integer, String> m:employee.entrySet())   
		 {    
		       System.out.println(m.getKey()+" "+m.getValue());    
		     }  
	}
}


