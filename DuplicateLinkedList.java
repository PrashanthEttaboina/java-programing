import java.util.LinkedList;
import java.util.Spliterator;

public class DuplicateLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(31);
		ll.add(16);
		ll.add(76);
		ll.add(89);
		ll.add(76);	
		ll.add(49);
		ll.add(53);
		ll.add(19);
		ll.add(10);
		ll.add(50);
		for(int i=0;i<ll.size();i++)
		{
			for(int j=i+1;j<ll.size();j++)
			{
				if(ll.get(i)==ll.get(j))
				{
					System.out.println(ll.get(i));
				}
			}
			
		}
				
	}

}
