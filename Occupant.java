class Employee  
{
String employee_name;
int employee_id;
int employee_salary;
String employee_address;
String employee_contact;
String employee_designation;
static String company_name;

Employee(String employee_name,int employee_id,int employee_salary,String employee_address,String employee_contact,String employee_designation)
{
this.employee_name=employee_name;
this.employee_id=employee_id;
this.employee_salary=employee_salary;
this.employee_address=employee_address;
this.employee_contact=employee_contact;
this.employee_designation=employee_designation;
this.company_name="Apashyampak kirikiri";
this.display();
}

void display()
{
System.out.println("Employee name : "+employee_name);
System.out.println("Employee ID : "+employee_id);
System.out.println("Salary : "+employee_salary);
System.out.println("Address : "+employee_address);
System.out.println("Mobile Number : "+employee_contact);
System.out.println("Designation : "+employee_designation);
System.out.println("Company Name : "+company_name);
}

}

public class Occupant 
{
public static void main(String args[])
{
System.out.println("==============Employee Details 1===============");
 
Employee prashanth= new Employee("Prashanth",2017,60000,"#11-20-90/D Autonagar Warangal Telangana.","9090123165","Java developer");

System.out.println("==============Employee Details 2===============");

Employee Maha= new Employee("Maha Lakshmi",2019,40000,"#19-210-160/c Gudeppad Warangal Telangana.","9010787965","Frontend Developer");
}
}

