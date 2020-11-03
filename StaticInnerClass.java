class University1
{
	static class Department
	{
		void announcement()
		{
			System.out.println("CSE results are declared");
		}
		static void result()
		{
			System.out.println("Results are posted on the University Website");
		}
	}
}
public class StaticInnerClass {

	public static void main(String[] args) {
		University1.Department cse=new University1.Department();
		cse.announcement();
		University1.Department.result();

	}

}
