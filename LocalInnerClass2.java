class College
{
	void exams()
	{
		System.out.println("College will conduct exams ");
		class Department
		{
			void cse()
			{
				System.out.println("Cse exams will start on 30th February");
			}
			void mech()
			{
				System.out.println("Exams for mech students will start on 31st November ");
			}
		}
		Department d=new Department();
		d.cse();
		d.mech();
	}
	
}
public class LocalInnerClass2 {

	public static void main(String[] args) {
		College svs =new College();
		svs.exams();
	}
}
