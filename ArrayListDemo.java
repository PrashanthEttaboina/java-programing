import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayListDemo {	
	public static void main(String[] args) 
	{
		ArrayList<String> names =new ArrayList<String>();
		names.add("Prashanth");
		names.add("Vasanth");
		names.add("Sunil");
		names.add("Dimple");
		names.add("Maha Lakshmi");
		names.add("Honey");
		names.add("Saketh");
		names.add("Prashanth");  //duplicates are allowed in array list
		names.add("Vasanth");
		names.add("Sunil");
		
		System.out.println(names);//Array List follows insertion order
		System.out.println(names.contains("Prashanth")); //usage of contains method returns a boolean value
		System.out.println(names.contains("Rahul")); //Prints false as the name is not present in the list
		System.out.println(names.isEmpty());  //returns false if there is atleast one element present 
		names.remove("Prashanth");
		System.out.println(names);
		
		ListIterator<String> i= names.listIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
