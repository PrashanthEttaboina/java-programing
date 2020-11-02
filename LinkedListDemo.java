import java.util.LinkedList;
import java.util.Spliterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(31);
		ll.add(16);
		ll.add(89);
		ll.add(76);	
		ll.add(49);
		ll.add(53);
		ll.add(19);
		ll.add(10);
		ll.add(50);
		ll.remove(4);   //here remove method needs the index of the element which is needed to be deleted 
		ll.removeFirstOccurrence(10); //this will remove the first occurrence of an element 
		ll.removeLast(); // this will delete the last added element 
		Spliterator<Integer> s = ll.spliterator();
		s.forEachRemaining(System.out::println);
	}

}
