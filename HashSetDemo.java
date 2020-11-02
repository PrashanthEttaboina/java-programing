import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> salary=new HashSet<Integer>();
		salary.add(12000);
		salary.add(12500);
		salary.add(15000);
		salary.add(60000);
		salary.add(45000);
		salary.add(10000);
		
		salary.remove(15000);
		System.out.println("The size of the hashset ="+salary.size()); //returns the size of the hash set
		System.out.println("The hashset is empty ???   "+salary.isEmpty()); //returns false if the salary is not empty
		
		Iterator<Integer> i=salary.iterator(); 
		while(i.hasNext())    //Hash Set doesnt follow insertion order
		{
			System.out.println(i.next());
		}
		salary.clear();
		System.out.println(salary);
	}

}
