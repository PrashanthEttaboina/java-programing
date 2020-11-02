import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo
{	
	public static void main(String[] args) {
		LinkedHashSet<String> Employee=new LinkedHashSet<String>();
		Employee.add("Prashanth");
		Employee.add("vasanth");
		Employee.add("Sunil");
		Employee.add("Anil");
		Employee.add("Dimple");
		Employee.add("Maha Lakshmi");
		Employee.add("Saketh");
		Employee.add("Honey");
		
		System.out.println(Employee);
		Employee.remove("Dimple");
		Iterator<String> it=Employee.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		Employee.clear();
		System.out.println(Employee);
		
	}

}
