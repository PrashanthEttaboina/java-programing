import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> names=new TreeSet<String>();
		names.add("Goutham");
		names.add("Rajesh");
		names.add("Zabeer");
		names.add("Kumar");
		names.add("Srinu");
		names.add("Sowmya");
		names.add("Sowmya"); //TreeSet doesn't allow Duplicates
		names.add("Ranga");
		names.add("Vikas");
		names.add("Sai");
		Iterator<String> it=names.iterator();  //TreeSet follows sorted order
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		names.clear(); // we have cleared the tree set here 
		if(names.isEmpty()) //Since there are no elements in the tree set condition will be passed 
		{
			System.out.println("The tree set is empty"); 
		}
	}

}
