import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int id;
	String name;
	int salary;
	public Employee(int id, String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
public class SerializeEx {

	public static void main(String[] args) throws IOException {
		
		Employee prashanth=new Employee(1021,"Prashanth",25000);
		FileOutputStream fo=new FileOutputStream("D:\\employee.txt");
		ObjectOutputStream os=new ObjectOutputStream(fo);
		os.writeObject(prashanth);
		os.flush();
		
	}

}
