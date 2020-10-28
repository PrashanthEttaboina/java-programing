class Student  
{
String student_name;
int student_id;
float student_percentage ;
String student_branch;
static String college_name;
char student_section;
}
class Employee
{
String employee_name;
int employee_id;
float employee_salary;
static String company_name;
int employee_batchNo;
}
public class Persons
{
public static void main(String [] args)
{
Student prashanth= new Student();
prashanth.student_name="Prashanth";
prashanth.student_id=17;
prashanth.student_percentage=75.3f;
prashanth.student_branch="CSE";
prashanth.student_section='B';
Student.college_name="CMR Institute of Technology";   //college name is given as static
System.out.println("================Student Details===================");
System.out.println("Student Name= "+prashanth.student_name);
System.out.println("Student ID= "+prashanth.student_id);
System.out.println("Student Percentage = "+prashanth.student_percentage);
System.out.println("Student branch = "+prashanth.student_branch);
System.out.println("Student section ="+prashanth.student_section);
System.out.println("College Name= "+Student.college_name);

Employee vasanth =new Employee();
vasanth.employee_name="Vasanth";
vasanth.employee_id=1203;
vasanth.employee_salary=30000.0f;
Employee.company_name="JNIT";
vasanth.employee_batchNo=15;
System.out.println("================Employee Details===================");
System.out.println("Employee Name = "+vasanth.employee_name);
System.out.println("Employee ID = "+vasanth.employee_id);
System.out.println("Employee Salary = "+vasanth.employee_salary);
System.out.println("Employee Batch no = "+vasanth.employee_batchNo);
System.out.println("Company Name = "+ Employee.company_name);
}
}