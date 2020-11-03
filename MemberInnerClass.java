
 class University 
{
	 void announcement()
		{
			System.out.println("Exams will start on 1st December");
		}
	class Department
	{
		void examPapers()
		{			
			System.out.println("Exam papers are being preared for the students");
		}	
	}
}

public class MemberInnerClass {

	public static void main(String[] args) {
	
		University CMR = new University();
		CMR.announcement();
		University.Department cse=new University().new Department();
		cse.examPapers();
		
	}

}
