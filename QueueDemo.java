import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Prashanth");  
		queue.add("Revanth");  
		queue.add("Vaishnavi");  
		queue.add("Maha Lakshmi");  
		queue.add("Kanya Kumari");  
		queue.add("Pranav");
		queue.add("Anirudh");
		queue.add("Kalyan");
		queue.add("Nagamani");
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		queue.remove(); //remove head element 
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> it=queue.iterator(); 
		while(it.hasNext()){  
		System.out.println(it.next());  
		}
	}

}
