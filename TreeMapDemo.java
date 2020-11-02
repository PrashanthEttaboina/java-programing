import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> employee=new TreeMap<Integer,String>();
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
		 for(Entry<Integer, String> m:employee.entrySet())   //This follows key sorted order
		 {    
		       System.out.println(m.getKey()+" "+m.getValue());    
		     }   
		 System.out.println("descendingMap: "+employee.descendingMap());  
	      //Returns key-value pairs whose keys are less than or equal to the specified key.  
	      System.out.println("headMap: "+employee.headMap(1002,true));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+employee.tailMap(1021,true));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+employee.subMap(100, false, 1021, true));   
	 
	}

}
