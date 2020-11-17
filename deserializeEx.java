import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserializeEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fi=new FileInputStream("D:\\employee.txt");
		ObjectInputStream oo=new ObjectInputStream(fi);
		
		Object o=oo.readObject();
		Employee prashanth= (Employee)o;
		System.out.println("Employee id = "+prashanth.id);
		System.out.println("Employee name ="+prashanth.name);
		System.out.println("Employee salary ="+prashanth.salary);
		
	}

}
