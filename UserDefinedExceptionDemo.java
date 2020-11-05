
public class UserDefinedExceptionDemo {

		public static void main(String args[]) throws Exam
		{
			int age =16;
			if(age>18)
			{
				System.out.println("Elgible for govt exams");
			}
			else
				throw new Exam("Not Elgible to write Govt Exams");
	}

}
class Exam extends Exception
{
	Exam(String s)
	{
		super(s);
	}
}
